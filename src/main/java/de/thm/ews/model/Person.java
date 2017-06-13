package de.thm.ews.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person {
    @GeneratedValue
    @Id
    private Long id;

    private String vorname;
    private String nachname;
    private Date gebDatum;
    private Date trittAusDatum;
    private String gebOrt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Date getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(Date gebDatum) {
        this.gebDatum = gebDatum;
    }

    public Date getTrittAusDatum() {
        return trittAusDatum;
    }

    public void setTrittAusDatum(Date trittAusDatum) {
        this.trittAusDatum = trittAusDatum;
    }

    public String getGebOrt() {
        return gebOrt;
    }

    public void setGebOrt(String gebOrt) {
        this.gebOrt = gebOrt;
    }

}
