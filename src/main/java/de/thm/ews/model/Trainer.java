package de.thm.ews.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.Set;

@Entity
public class Trainer extends Person {

    @OneToOne
    @JsonIgnore
    private Login login;

    @ManyToMany()
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Kurs> kurse;

    @OneToMany
    private List<Termin> termine ;

    public Set<Kurs> getKurse() {
        return kurse;
    }

    public void setKurse(Set<Kurs> kurse) {
        this.kurse = kurse;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
