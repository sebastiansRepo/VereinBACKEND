package de.thm.ews.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Mitglied extends Person{

    @ManyToMany(mappedBy = "mitgliederAngemeldet")
    @JsonIgnore
    private Set<Kurs> kurse;

}
