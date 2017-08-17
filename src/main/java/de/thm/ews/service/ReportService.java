package de.thm.ews.service;

import de.thm.ews.model.Geschlecht;
import de.thm.ews.model.Mitglied;
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


    @Path("trainer/{id}")
    @GET
    public Report createReportForTrainer(@PathParam("id") Long id) {
        //check if id 0= root User
        if (id ==  1) {
            //TODO - die ID wird aktuell als Kurs-ID verwendet!

            //zeigt alle Termine für den speziellen Kurs an
//            TypedQuery<Termin> test = em.createQuery("select t from Kurs k, IN (k.termine) t WHERE k.name = :kursName", Termin.class);
//            test.setParameter("kursName", "Karate");

            //zeigt alle Mitglider an, die an den Terminen des Kurses anwesend waren
//            TypedQuery<Mitglied> test = em.createQuery("select anwesend from Kurs k, IN (k.termine) t, IN (t.mitgliederAnwesend) anwesend WHERE k.name = :kursName ", Mitglied.class);
//            test.setParameter("kursName", "Karate");

            //zeigt alle Mitglieder an, die an den Terminen des Kurses anwesend waren und auch am Kurs angemeldet waren!
//            TypedQuery<Mitglied> query1 = em.createQuery("select anwesend from Kurs k, IN (k.termine) t, IN (t.mitgliederAnwesend) anwesend WHERE k.id = :id AND anwesend MEMBER OF k.mitgliederAngemeldet", Mitglied.class);
//            query1.setParameter("id", id);

            TypedQuery<Long> query1 = em.createQuery("select count(anwesend) from Kurs k, IN (k.termine) t, IN (t.mitgliederAnwesend) anwesend WHERE k.id = :id AND anwesend MEMBER OF k.mitgliederAngemeldet", Long.class);
            Long anzahlAngemeldeteMitgliederAnwesend = query1.setParameter("id", id).getSingleResult();

            TypedQuery<Long> query2 = em.createQuery("select count(m) from Kurs k, IN (k.mitgliederAngemeldet) m WHERE k.id = ?1", Long.class);
            Long anzahlAngemeldet =  query2.setParameter(1, id).getSingleResult();

            TypedQuery<Long> query3 = em.createQuery("select count(t) from Kurs k, IN (k.termine) t WHERE t.datum < CURRENT_DATE AND k.id = :id", Long.class);
            Long anzahlVergangeneTermineFuerKurs = query3.setParameter("id", id).getSingleResult();

//            17 / 4(Anzahl Leute die angemeldet sind) * 6 (#Anzahl Termine die schon gewesen sind)

            Double percent = (anzahlAngemeldeteMitgliederAnwesend).doubleValue() / (anzahlAngemeldet.doubleValue() * anzahlVergangeneTermineFuerKurs.doubleValue()) * 100;

            System.out.println();


        } else {
            //special report only for the given trainer

        }

        return null;

    }

    @Path("kurs/{id}")
    @GET
    public Report createReportForKurs(@PathParam("id") Long id) {
        String allReports =
                getFirstReportContent(id)  + "\n" +
                        getSecondReportContent(id) + "\n" +
                        getThirdReportContent(id)  + "\n";
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

        return "" + new BigDecimal(percent,new MathContext(4)) + "%";
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


        return "" + new BigDecimal(percentMen,new MathContext(4)) + "% Men " + new BigDecimal(percentWomen,new MathContext(4)) + "% Women" ;
    }

    private String getThirdReportContent(Long kursId) {

        //TODO - noch Fehler vorhanden!

        TypedQuery<Mitglied> q = em.createQuery("select anwesend from Kurs k, IN (k.termine) t, IN (t.mitgliederAnwesend) anwesend WHERE k.id = :id AND anwesend MEMBER OF k.mitgliederAngemeldet", Mitglied.class);
            q.setParameter("id", kursId);

        TypedQuery<Double> query1 = em.createQuery("select CURRENT_DATE - anwesend.gebDatum from Kurs k, IN (k.termine) t, IN (t.mitgliederAnwesend) anwesend WHERE k.id = :id  AND anwesend MEMBER OF k.mitgliederAngemeldet", Double.class);
//        Long anzahlAngemeldeteMitgliederAnwesend = query1.setParameter("id", kursId).getSingleResult();

        TypedQuery<Long> query2 = em.createQuery("select count(m) from Kurs k, IN (k.mitgliederAngemeldet) m WHERE k.id = ?1 AND (CURRENT_DATE - m.gebDatum) between :startAlterGruppe AND :endeAltersGruppe", Long.class);
        Long anzahlAngemeldet =  query2.setParameter(1, kursId).setParameter("startAlterGruppe", 10d).setParameter("endeAltersGruppe", 25d).getSingleResult();

        TypedQuery<Long> query3 = em.createQuery("select count(t) from Kurs k, IN (k.termine) t WHERE t.datum < CURRENT_DATE AND k.id = :id", Long.class);
        Long anzahlVergangeneTermineFuerKurs = query3.setParameter("id", kursId).getSingleResult();

//        Double percent = (anzahlAngemeldeteMitgliederAnwesend).doubleValue() / (anzahlAngemeldet.doubleValue() * anzahlVergangeneTermineFuerKurs.doubleValue()) * 100;

        return "" + new BigDecimal(12,new MathContext(4)) + "%";

    }

}
