/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.miniProjetGestion;

import java.util.Scanner;

/**
 *
 * @author MHDN
 */
public class MenuGestion {
    int choix;
    
    
     public static void main(String args[]){
         
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*= MENU =*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("1- Gestion Groupe");
        System.out.println("2- Gestion Etudiant");
        System.out.println("3- Gestion Professeurs");
        System.out.println("4- Gestion groupe-Etudiant");
        System.out.println("5- Quitter");
        System.out.println("Votre Choix :");
        
        Scanner cl=new Scanner(System.in);
        int choix=cl.nextInt();
        
        switch(choix){
            case 1: System.out.println("Vous avez choisi Gestion Groupe :\n");
                 System.out.println("========================================");
                 System.out.println(" 1- Creer un Groupe");
                 System.out.println(" 2- Modifier un Groupe");
                 System.out.println(" 3- Voire les details d'un Groupe");
                 System.out.println(" 4- Supprimer un Groupe");
                 System.out.println(" 5- Afficher tous les Groupes");
                 System.out.println(" 6- Quitter");
                 Scanner ch=new Scanner(System.in);
                 choix=ch.nextInt();
                 switch(choix){
                     case 1:System.out.println("Creation d'un groupe");break;
                     case 2:System.out.println("Modification d'un groupe");break;
                     case 3:System.out.println("Details d'un groupe");break;
                     case 4:System.out.println("Suppression d'un Groupe :");break;
                     case 5:System.out.println("Affichage des groupes");break;
                     case 6:
                     default: System.out.println("Veuillez entrez un chix entre 1 et 6");
                 }
                 break;
            case 2:System.out.println("Vous avez choisi Gestion Etudiant");
                 System.out.println("============================================");
                 System.out.println(" 1- Ajouter un etudiant");
                 System.out.println(" 2- Modifier un etudiant");
                 System.out.println(" 3- Voire les details d'un etudiant");
                 System.out.println(" 4- Supprimer un etudiant");
                 System.out.println(" 5- Afficher tous les etudiants");
                 System.out.println(" 6- Quitter");  break;
                 
            case 3:System.out.println("Vous avez choisi Gestion Professeurs");
                 System.out.println("============================================");
                 System.out.println(" 1- Ajouter un professeur");
                 System.out.println(" 2- Modifier un professeur");
                 System.out.println(" 3- Voire les details d'un professeur");
                 System.out.println(" 4- Supprimer un professeur");
                 System.out.println(" 5- Afficher tous les professeurs");
                 System.out.println(" 6- Quitter");  break;
                 
            case 4:System.out.println("Vous avez choisi Gestion Etudiant d'un groupe");
                 System.out.println("============================================");
                 System.out.println(" 1- Ajouter un etudiant");
                 System.out.println(" 2- Modifier un etudiant");
                 System.out.println(" 3- Voire les details d'un etudiant");
                 System.out.println(" 4- Supprimer un etudiant");
                 System.out.println(" 5- Afficher tous les etudiants");
                 System.out.println(" 6- Quitter");  break;
                 
            case 5: System.exit(0);
            default: System.out.println("Veuillez choisir entre 1 et 5");break;
            }
        
          }
 
    }
     

