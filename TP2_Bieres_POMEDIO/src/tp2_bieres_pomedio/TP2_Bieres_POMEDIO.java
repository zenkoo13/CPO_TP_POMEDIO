/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class TP2_Bieres_POMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     BouteilleBiere uneBiere = new BouteilleBiere() ;
 uneBiere.nom = "Cuvée des trolls";
 uneBiere.degreAlcool = 7.0 ;  
 uneBiere.brasserie="Dubuisson";
 uneBiere.ouverte=false;
  uneBiere.lireEtiquette(); 
  

uneBiere.nom = "Leffe";
 uneBiere.degreAlcool = 6.6 ;  
 uneBiere.brasserie="Abbaye de Leffe";
 uneBiere.ouverte=false;
  uneBiere.lireEtiquette();
 
    }
}

   