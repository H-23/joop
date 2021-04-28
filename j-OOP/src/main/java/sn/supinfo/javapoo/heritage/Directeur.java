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
public class Directeur extends Employe{
    private double bonus;
    
    public Directeur(){}
    
    public Directeur(String prenom, String nom, double salaire, double bonus){
        super(prenom, nom, salaire);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Directeur " + " bonus=" + bonus ;
    }
     
    
}
