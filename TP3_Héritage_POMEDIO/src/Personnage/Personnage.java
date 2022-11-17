/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author kenzopomedio
 */
public class Personnage {
    
    String nom;
    int niv_vie;
    
    ArrayList<Arme> stockage = new ArrayList<Arme>();
    Arme arme_en_main;
   
    public Personnage(String unNom, int unNiv_vie){
        nom=unNom;
        niv_vie=unNiv_vie;
        arme_en_main = null;
    }
   
    public void ajouterArme (Arme arme_a_ajouter){
        if (stockage.size()<5){
            stockage.add(arme_a_ajouter);          
        }
    }
   
    public Arme getArme_en_main(){
        return arme_en_main;
    }
   
    public void EquipArme(String uneArme){
        for (int i=0; i<stockage.size();i++){
            if (stockage.get(i).getNom().equals(uneArme)){
                arme_en_main=stockage.get(i);
                System.out.println("L'arme a bien ete affecte");
            }else{
                System.out.println("L'arme n'a pas ete trouvé");
            }
        }
    }
    
    
    
@Override
   
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + ":" +niv_vie;
    
        return chaine_a_retourner ;
    }
    
    
}


    

