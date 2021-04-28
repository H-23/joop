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
public class TestEmployeDirecteur {
    public static void main(String args[]){
        Employe emp1= new Employe("Ibrahima", "SARR", 300000);
        Employe emp2= new Employe("Fatou", "SARR", 350000);
        Directeur d1= new Directeur("Jean_Marie", "LePen", 600000, 25000);
        Directeur d2= new Directeur("Khadim", "SECK", 700000, 35000);
        
       /* System.out.println("Les Employes");
        System.out.println(emp1);
        System.out.println(emp2);
        
        System.out.println("Les Directeurs");
        System.out.println(d1);
        System.out.println(d2);*/
        
        //Polymorphisme
        Employe [] tabEmploye={emp1, emp2, d1, d2};
        for(Employe e: tabEmploye){
            System.out.println(e);
        }
    }
    
}
