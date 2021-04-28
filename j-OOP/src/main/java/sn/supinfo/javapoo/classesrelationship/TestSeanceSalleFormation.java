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
public class TestSeanceSalleFormation {
    public static void main(String args[]){
        
        Module module1=new Module();
        module1.setId(4);
        module1.setNom("Java POO");
        module1.setVolumeHoraire(20);
        module1.setCoefficient(3);
        
        SalleFormation salleFormation = new SalleFormation();
        salleFormation.setId(1);
        salleFormation.setNom("Bluray");
        salleFormation.setCapacite(50);

        SeanceFormation seanceFormation1=new SeanceFormation();
        seanceFormation1.setDate("13-03-2021");
        seanceFormation1.setHeureDebut("9h 00");
        seanceFormation1.setHeureFin("11h 00");
        seanceFormation1.setModule(module1);
        seanceFormation1.setSalleFormation(salleFormation);
        
        SeanceFormation seanceFormation2=new SeanceFormation();
        seanceFormation2.setDate("13-03-2021");
        seanceFormation2.setHeureDebut("9h 00");
        seanceFormation2.setHeureFin("11h 00");
        seanceFormation2.setModule(module1);
        seanceFormation2.setSalleFormation(salleFormation);
        
        SeanceFormation seanceFormation3=new SeanceFormation();
        seanceFormation3.setDate("13-03-2021");
        seanceFormation3.setHeureDebut("9h 00");
        seanceFormation3.setHeureFin("11h 00");
        seanceFormation3.setModule(module1);
        seanceFormation3.setSalleFormation(salleFormation);
        
        
        SeanceFormation [] tabSeance= new SeanceFormation[5];
        tabSeance[0]= seanceFormation1;
        tabSeance[1]= seanceFormation2;
        tabSeance[2]= seanceFormation3;
        seanceFormation1.setModule(module1);
        seanceFormation1.setSalleFormation(salleFormation);
        
        salleFormation.setSeanceFormation(tabSeance);
        
        System.out.println("les salles de formation");
        System.out.println(salleFormation);
        System.out.println("les seances");
        for(SeanceFormation seance : tabSeance){
            System.out.println(seance);
        }
    }
    
}
