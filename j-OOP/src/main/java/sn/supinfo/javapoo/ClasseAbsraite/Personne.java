/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.ClasseAbsraite;

import java.util.Objects;

/**
 *
 * @author MHDN
 */
public abstract class Personne {
    
    private String prenom;
    private String nom;
    private String adresse;
   
    
    public Personne(){}

    public Personne(String prenom, String nom, String adresse) {
        
        this.prenom = prenom;
        this.nom = nom;
       
        this.adresse = adresse;
       
    }

    public abstract String getNomComplet();

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

  

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    @Override
    public String toString(){
        return "Personne" + "prenom=" + prenom + ", nom=" + nom  + ", adresse=" + adresse ;
    }
    
    
    
    
    
    
}
