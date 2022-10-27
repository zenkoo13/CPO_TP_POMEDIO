/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class TP2_relation_1_POMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
       
       
        bob.liste_voitures[0] = uneClio ;
        bob.nbrVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("La premiere voiture de Bob est "+ bob.liste_voitures[0]); 
   
       
        uneMicra.Proprietaire= reno; 
        reno.nbrVoitures=1;
        reno.liste_voitures[0]=uneMicra;
       
        
        uneAutreClio.Proprietaire= reno;
        reno.nbrVoitures+=1;
        reno.liste_voitures[reno.nbrVoitures-1]= uneAutreClio;
        
        
        System.out.println(bob.ajouter_voiture(une2008)); 
        System.out.println(bob.ajouter_voiture(uneAutreClio)); 
    }
   
}
