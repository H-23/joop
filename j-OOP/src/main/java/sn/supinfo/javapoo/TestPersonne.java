
package sn.supinfo.javapoo;

/**
 *
 * @author MHDN
 */
public class TestPersonne {
    public static void main(String[] args)
    {
        Personne p1=new Personne();
        p1.setPrenom("Amy");
        p1.setNom("Diouf");
        p1.setAdresse("Grand-Yoff");
        p1.setAge(25);
        p1.setTelephone("771542635");
        
        Personne p2=new Personne("Demba","Paye","Keur-Massar",30);
        
        Personne p3=new Personne("Steph","Curry");
        
        System.out.println(p1);
        System.out.println("*******************************************");
        System.out.println("*******************************************");
        System.out.println(p2);
        System.out.println("*******************************************");
        System.out.println("*******************************************");
        System.out.println(p3);
        System.out.println(Personne.getNombreObjetCree());
        System.out.println(p2.getPays());
        
      
        
    }
    // TOODO 
    
}
