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
public class TestPersonne {
    public static void main(String[] args){
        Personne p = new Personne();
        p.setId(1);
        p.setPrenom("Mouhamed");
        p.setNom("Diop");
        p.setDateNaissance("22/09/1988");
        p.setLieuNaissance("Bakel");
        p.setAdresse("Sedhiou");
        p.setTelephone("");
        p.setEmail("");
        p.setNationalite("");
        p.setGenre("");
        p.setSituationMatrimonial("");
                
        
    
       Etudiant etudiant =new Etudiant(1,"LS1200","David","Fall","14-08-1980","Rufisque","Derklé","774940449","kiddmorr@yahoo.fr","Senegalaise","masculin","Celibataire","B+");
       
       Professeur Prof=new Professeur(1,"KJ254l","Badara","Dianté","12-01-1975","Kaolack","Dalifort","705461247","badarazogmail.com","Senegalaise","masculin","Marié","Mathematique");
       
       System.out.println(p);
       System.out.println(etudiant);
       System.out.println(Prof);
       
       
       
    }
}
