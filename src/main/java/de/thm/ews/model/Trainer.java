package de.thm.ews.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Trainer extends Person  {
    private List<Kurs> kurse;

    public List<Kurs> getKurse() {
        return kurse;
    }

    public void setKurse(List<Kurs> kurse) {
        this.kurse = kurse;
    }
}
