/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.heritage;

/**
 *
 * @author MHDN
 */
public class Employe {
    private String prenom;
    private String nom;
    private double salaire;
    
    public Employe(){}
    
    public Employe(String prenom, String nom, double salaire){
        this.prenom=prenom;
        this.nom=nom;
        this.salaire=salaire;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "prenom= " + prenom + ", nom= " + nom + ", salaire= " + salaire;
    }
    
    
}
