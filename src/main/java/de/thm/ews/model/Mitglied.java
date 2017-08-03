package de.thm.ews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Mitglied extends Person{

    //TODO - wird evtl als ManyToMany gebraucht für
//    private List<Termin> visitedCourses;
//
//    public List<Termin> getVisitedCourses() {
//        return visitedCourses;
//    }
//
//    public void setVisitedCourses(List<Termin> visitedCourses) {
//        this.visitedCourses = visitedCourses;
//    }
}
