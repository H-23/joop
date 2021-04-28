/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo;

/**
 *
 * @author MHDN
 */
public class Personne {
    private String prenom;
    private String nom;
    private String adresse;
    private int age;
    private String telephone;
    private String email;
    private static int nombreObjetCree = 0;
    private final String PAYS="Senegal";
    private final double TAUXTVA=18.0;
    
    public Personne(){
        Personne.nombreObjetCree++;
            }
    
    
     public Personne(String prenom, String nom){
        this.prenom=prenom;
        this.nom=nom;
        Personne.nombreObjetCree++;
    }
    
    public Personne(String prenom,String nom,String adresse,int age){
        this(prenom,nom);
        this.nom=nom;
        this.adresse=adresse;
        this.age=age;
        Personne.nombreObjetCree++;
        
    }
    
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static int getNombreObjetCree(){
        return Personne.nombreObjetCree;
    }
    
    public String getPays(){
        return this.PAYS;
    }
    
     public double getTauxTva(){
        return this.TAUXTVA;
    }


    @Override
    public String toString() {
        return "Personne{" + "prenom=" + prenom + "\n nom=" + nom + "\n adresse=" + adresse + "\n age=" + age + "\n telephone=" + telephone + "\n email=" + email + '}';
    }
   
    
    
}