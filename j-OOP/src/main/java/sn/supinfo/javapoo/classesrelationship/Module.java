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
public class Module {
    private int id;
    private String nom;
    private int volumeHoraire;
    private int coefficient;
    
    public Module(){}

    public Module(int id, String nom, int volumeHoraire, int coefficient) {
        this.id = id;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(int volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "Module{" + "id=" + id + ", nom=" + nom + ", volumeHoraire=" + volumeHoraire + ", coefficient=" + coefficient ;
    }
    
   
    
    
}
