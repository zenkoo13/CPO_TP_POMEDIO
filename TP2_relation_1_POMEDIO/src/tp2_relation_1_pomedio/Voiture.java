/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    public Voiture(String modele, String marque, int CV){//caracteristique de la voiture
        Modele=modele;
        Marque=marque;
        PuissanceCV=CV;
        Proprietaire=null;
    }
    @Override
public String toString () {
String descrp_voiture;
descrp_voiture="Modele:"+Modele+",Marque"+Marque+",Puissance"+PuissanceCV+"CV";
return descrp_voiture;
}
  
}
