package de.thm.ews.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Termin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Date datum;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Mitglied> mitgliederAnwesend;

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

    public Set<Mitglied> getMitgliederAnwesend() {
        return mitgliederAnwesend;
    }

    public void setMitgliederAnwesend(Set<Mitglied> mitgliederAnwesend) {
        this.mitgliederAnwesend = mitgliederAnwesend;
    }

}
