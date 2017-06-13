package de.thm.ews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Anwesenheit {
    @GeneratedValue
    @Id
    private Long id;

    private Mitglied mitglied;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mitglied getMitglied() {
        return mitglied;
    }

    public void setMitglied(Mitglied mitglied) {
        this.mitglied = mitglied;
    }
}
