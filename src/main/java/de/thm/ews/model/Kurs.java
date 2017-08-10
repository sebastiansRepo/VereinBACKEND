package de.thm.ews.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Kurs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @OneToMany(fetch = FetchType.EAGER ,cascade = CascadeType.ALL) //if course would be removed, remove all related "Termine"
    private List<Termin> termine;

    private String name;

    @ManyToMany(mappedBy = "kurse")
    @JsonIgnore
    private Set<Trainer> trainer;

    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Mitglied> mitgliederAngemeldet;

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

    public Set<Mitglied> getMitgliederAngemeldet() {
        return mitgliederAngemeldet;
    }

    public void setMitgliederAngemeldet(Set<Mitglied> mitgliederAngemeldet) {
        this.mitgliederAngemeldet = mitgliederAngemeldet;
    }

    public Set<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(Set<Trainer> trainer) {
        this.trainer = trainer;
    }
}
