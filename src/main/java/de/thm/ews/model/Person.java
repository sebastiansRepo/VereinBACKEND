package de.thm.ews.model;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class Person {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;


    private String vorname;
    private String nachname;
    private Date gebDatum;
    private Date trittAusDatum;
    private String gebOrt;
    @Enumerated(EnumType.STRING)
    private Geschlecht geschlecht;

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

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }


}
