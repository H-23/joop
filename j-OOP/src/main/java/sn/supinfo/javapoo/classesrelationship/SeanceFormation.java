/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.classesrelationship;

/**
 *
 * @author MHDN
 */
public class SeanceFormation {
    private String date;
    private String heureDebut;
    private String heureFin;
    private SalleFormation salleFormation;
    private Module module;
    
    public SeanceFormation(){}

    public SeanceFormation(String date, String heureDebut, String heureFin) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin; 
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public SalleFormation getSalleFormation() {
        return salleFormation;
    }

    public void setSalleFormation(SalleFormation salleFormation) {
        this.salleFormation = salleFormation;
    }
        public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "SeanceFormation{" + "date=" + date + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", module=" + module + '}';
    }
    
    
    
    
    
}

    
