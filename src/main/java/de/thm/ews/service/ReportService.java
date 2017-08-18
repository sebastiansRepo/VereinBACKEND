package de.thm.ews.service;

import de.thm.ews.model.Geschlecht;
import de.thm.ews.model.Report;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.math.MathContext;

@Stateless
@Path("report")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class ReportService {

    @PersistenceContext
    private EntityManager em;

    @Path("kurs/{id}")
    @GET
    public Report createReportForKurs(@PathParam("id") Long id) {
        String allReports =
                        getFirstReportContent(id)  + " <br><br> " +

                        getSecondReportContent(id) + " <br><br> "  +

                        getThirdReportContent(id, 10, 25)  + " <br><br> " +
                        getThirdReportContent(id, 26, 35)  + " <br><br> " +
                        getThirdReportContent(id, 36, 50)  + " <br><br>" +
                        getThirdReportContent(id, 51, 70)  + " <br><br> " +
                        getThirdReportContent(id, 71, 99)  + " <br><br> " +

                        getFourthReportContent(id);
        return new Report(allReports);
    }


    private String getFirstReportContent(Long kursId) {

        TypedQuery<Long> query1 = em.createQuery("select count(anwesend) from Kurs k, IN (k.termine) t, IN (t.mitgliederAnwesend) anwesend WHERE k.id = :id AND anwesend MEMBER OF k.mitgliederAngemeldet", Long.class);
        Long anzahlAngemeldeteMitgliederAnwesend = query1.setParameter("id", kursId).getSingleResult();

        TypedQuery<Long> query2 = em.createQuery("select count(m) from Kurs k, IN (k.mitgliederAngemeldet) m WHERE k.id = ?1", Long.class);
        Long anzahlAngemeldet =  query2.setParameter(1, kursId).getSingleResult();

        TypedQuery<Long> query3 = em.createQuery("select count(t) from Kurs k, IN (k.termine) t WHERE t.datum < CURRENT_DATE AND k.id = :id", Long.class);
        Long anzahlVergangeneTermineFuerKurs = query3.setParameter("id", kursId).getSingleResult();

        Double percent = (anzahlAngemeldeteMitgliederAnwesend).doubleValue() / (anzahlAngemeldet.doubleValue() * anzahlVergangeneTermineFuerKurs.doubleValue()) * 100;

        return "Percentage of registered Members appearing to the course: " + new BigDecimal(percent,new MathContext(4)) + "%";
    }

    private String getSecondReportContent(Long kursId) {

        //for men
        TypedQuery<Long> query1M = em.createQuery("select count(anwesend) from Kurs k, IN (k.termine) t, IN (t.mitgliederAnwesend) anwesend WHERE k.id = :id AND anwesend.geschlecht = :geschlecht AND anwesend  MEMBER OF k.mitgliederAngemeldet", Long.class);
        Long anzahlAngemeldeteMitgliederAnwesendM = query1M.setParameter("id", kursId).setParameter("geschlecht", Geschlecht.MAENNLICH).getSingleResult();

        TypedQuery<Long> query2M = em.createQuery("select count(m) from Kurs k, IN (k.mitgliederAngemeldet) m WHERE k.id = ?1 AND m.geschlecht = :geschlecht", Long.class);
        Long anzahlAngemeldetM =  query2M.setParameter(1, kursId).setParameter("geschlecht", Geschlecht.MAENNLICH).getSingleResult();

        TypedQuery<Long> query3M = em.createQuery("select count(t) from Kurs k, IN (k.termine) t WHERE t.datum < CURRENT_DATE AND k.id = :id", Long.class);
        Long anzahlVergangeneTermineFuerKursM = query3M.setParameter("id", kursId).getSingleResult();

        //for women
        TypedQuery<Long> query1W = em.createQuery("select count(anwesend) from Kurs k, IN (k.termine) t, IN (t.mitgliederAnwesend) anwesend WHERE k.id = :id AND anwesend.geschlecht = :geschlecht AND anwesend MEMBER OF k.mitgliederAngemeldet", Long.class);
        Long anzahlAngemeldeteMitgliederAnwesendW = query1W.setParameter("id", kursId).setParameter("geschlecht", Geschlecht.WEIBLICH).getSingleResult();

        TypedQuery<Long> query2W = em.createQuery("select count(m) from Kurs k, IN (k.mitgliederAngemeldet) m WHERE k.id = ?1 AND m.geschlecht = :geschlecht", Long.class);
        Long anzahlAngemeldetW =  query2W.setParameter(1, kursId).setParameter("geschlecht", Geschlecht.WEIBLICH).getSingleResult();

        TypedQuery<Long> query3W = em.createQuery("select count(t) from Kurs k, IN (k.termine) t WHERE t.datum < CURRENT_DATE AND k.id = :id", Long.class);
        Long anzahlVergangeneTermineFuerKursW = query3W.setParameter("id", kursId).getSingleResult();

        Double percentMen = (anzahlAngemeldeteMitgliederAnwesendM).doubleValue() / (anzahlAngemeldetM.doubleValue() * anzahlVergangeneTermineFuerKursM.doubleValue()) * 100;
        Double percentWomen = (anzahlAngemeldeteMitgliederAnwesendW).doubleValue() / (anzahlAngemeldetW.doubleValue() * anzahlVergangeneTermineFuerKursW.doubleValue()) * 100;


        return "Percentage of registered male Members appearing to the course: " + new BigDecimal(percentMen,new MathContext(4)) + "% <br><br> Percentage of registered female Members appearing to the course: " + new BigDecimal(percentWomen,new MathContext(4)) + "%" ;
    }

    private String getThirdReportContent(Long kursId, Integer startDate, Integer endDate) {

        TypedQuery<Long> query1 = em.createQuery("select count(anwesend) from Kurs k, IN (k.termine) t, IN (t.mitgliederAnwesend) anwesend WHERE k.id = :id AND (YEAR(current_date) - YEAR(anwesend.gebDatum) BETWEEN :startDate AND :endDate) AND anwesend MEMBER OF k.mitgliederAngemeldet", Long.class);
        Long anzahlAngemeldeteMitgliederAnwesend = query1.setParameter("id", kursId).setParameter("startDate", startDate).setParameter("endDate", endDate).getSingleResult();

        TypedQuery<Long> query2 = em.createQuery("select count(m) from Kurs k, IN (k.mitgliederAngemeldet) m WHERE k.id = ?1 AND (YEAR(current_date) - YEAR(m.gebDatum) BETWEEN :startDate AND :endDate)", Long.class);
        Long anzahlAngemeldet =  query2.setParameter(1, kursId).setParameter("startDate", startDate).setParameter("endDate", endDate).getSingleResult();

        TypedQuery<Long> query3 = em.createQuery("select count(t) from Kurs k, IN (k.termine) t WHERE t.datum < CURRENT_DATE AND k.id = :id", Long.class);
        Long anzahlVergangeneTermineFuerKurs = query3.setParameter("id", kursId).getSingleResult();

        Double percent = (anzahlAngemeldeteMitgliederAnwesend).doubleValue() / (anzahlAngemeldet.doubleValue() * anzahlVergangeneTermineFuerKurs.doubleValue()) * 100;

        if (percent.isInfinite() || percent.isNaN()) {
            return "Percentage of registered Members, between " + startDate + " and " + endDate +" ages, appearing to the course: no members in this age span" ;
        } else {
            return "Percentage of registered Members, between " + startDate + " and " + endDate +" ages, appearing to the course: " + new BigDecimal(percent,new MathContext(4)) + "%";
        }

    }

    private String getFourthReportContent(Long kursId) {

        TypedQuery<Long> query2 = em.createQuery("select count(m) from Kurs k, IN (k.mitgliederAngemeldet) m WHERE k.id = ?1", Long.class);
        Long anzahlAngemeldet =  query2.setParameter(1, kursId).getSingleResult();

        TypedQuery<Long> query2M = em.createQuery("select count(m) from Kurs k, IN (k.mitgliederAngemeldet) m WHERE k.id = ?1 AND m.geschlecht = :geschlecht", Long.class);
        Long anzahlAngemeldetM =  query2M.setParameter(1, kursId).setParameter("geschlecht", Geschlecht.MAENNLICH).getSingleResult();

        TypedQuery<Long> query2W = em.createQuery("select count(m) from Kurs k, IN (k.mitgliederAngemeldet) m WHERE k.id = ?1 AND m.geschlecht = :geschlecht", Long.class);
        Long anzahlAngemeldetW =  query2W.setParameter(1, kursId).setParameter("geschlecht", Geschlecht.WEIBLICH).getSingleResult();


        Double percentMale = (anzahlAngemeldetM).doubleValue() / (anzahlAngemeldet.doubleValue()) * 100;
        Double percentFemale = (anzahlAngemeldetW).doubleValue() / (anzahlAngemeldet.doubleValue()) * 100;

        String result = "";

        if (!percentMale.isNaN() || !percentMale.isInfinite()) {
            result += "Percentage of male Members: " + (new BigDecimal(percentMale,new MathContext(4))) + "%";
        }

        if (!percentFemale.isNaN() || !percentFemale.isInfinite()) {
            if(result.equals("")) {
                result += "Percentage of female Members: " + (new BigDecimal(percentFemale,new MathContext(4))) + "%";
            } else {
                result += " <br><br> Percentage of female Members: " + (new BigDecimal(percentFemale,new MathContext(4))) + "%";
            }
        }
        return result;
    }

}
