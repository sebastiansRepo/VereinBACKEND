package de.thm.ews.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Kurs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @OneToMany(cascade = CascadeType.ALL) //if course would be removed, remove all related "Termine"
    private List<Termin> termine;

    private String name;

    @OneToMany
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
