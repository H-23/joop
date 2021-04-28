/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javase.tableaux;

/**
 *
 * @author MHDN
 */
public class Tableaux {
    public static void main(String[] args){
    //  Creation de tableaux premiere forme
    int [] tabInt = new int[10];
    tabInt[0]=25;
    tabInt[1]=30;
    tabInt[2]=0;
    tabInt[3]=-1;
    tabInt[4]=5;
    tabInt[5]=10;
    tabInt[6]=80;
    
    // Creation de tableaux deuxieme forme
    String[] tabPays = {"Senegal","Mali","Niger","Congo"};
    
    //Ajout d'element au tableau
    tabInt[7]=100;
    tabInt[8]=-25;
    tabInt[9]=300;
    //tabPays[2]="Republique de Guinée";
   // tabPays[3]="Guinée Bissau";
   // tabInt[4]=254;
    //Affichage de tous es elements
    for(int i=0; i<tabPays.length; i++)
    {
    //Affichage des elements individuels
    //System.out.println(tabInt[5]);
    System.out.println(tabPays[i]);
    }
    
    //Deuxiee forme boucle for
    for(int i: tabInt){
        System.out.println(i);
    }
    }
    
    
}
