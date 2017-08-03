package de.thm.ews.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Trainer extends Person {

    @OneToOne
    private Login login;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Kurs> kurse;

    public List<Kurs> getKurse() {
        return kurse;
    }

    public void setKurse(List<Kurs> kurse) {
        this.kurse = kurse;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
