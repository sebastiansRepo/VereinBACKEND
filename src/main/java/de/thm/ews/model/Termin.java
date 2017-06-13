package de.thm.ews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Termin {
    @GeneratedValue
    @Id
    private Long id;

    private Date datum;
    private Trainer trainer;
    private List<Mitglied> mitgliederAnwesend;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Mitglied> getMitgliederAnwesend() {
        return mitgliederAnwesend;
    }

    public void setMitgliederAnwesend(List<Mitglied> mitgliederAnwesend) {
        this.mitgliederAnwesend = mitgliederAnwesend;
    }
}