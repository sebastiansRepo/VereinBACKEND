package de.thm.ews.model;

import javafx.util.Pair;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Kurs {
    @GeneratedValue
    @Id
    private Long id;

    private List<Termin> termine;
    private String name;
    private List<Mitglied> mitgliederAngemeldet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Termin> getTermine() {
        return termine;
    }

    public void setTermine(List<Termin> termine) {
        this.termine = termine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mitglied> getMitgliederAngemeldet() {
        return mitgliederAngemeldet;
    }

    public void setMitgliederAngemeldet(List<Mitglied> mitgliederAngemeldet) {
        this.mitgliederAngemeldet = mitgliederAngemeldet;
    }
}
