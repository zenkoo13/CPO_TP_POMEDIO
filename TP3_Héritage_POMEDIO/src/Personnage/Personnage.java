/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author kenzopomedio
 */
public class Personnage {
    
    String nom;
    int niv_vie;
    
    public Personnage(String unNom, int unNiv_vie){
        nom=unNom;
        niv_vie=unNiv_vie;
        if(unNiv_vie>100){
            niv_vie=100;
        }
        else if (unNiv_vie<0){
            niv_vie=0;
        }
    }
    
@Override
   
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + ":" +niv_vie;
    
        return chaine_a_retourner ;
    }
    
    
}


    

