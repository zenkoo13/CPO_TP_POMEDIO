/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author kenzopomedio
 */
public class Arme {
    String nom;
    int niv_attaque;
    
    public Arme(String unNom, int unNiv_attaque){
        nom=unNom;
        niv_attaque=unNiv_attaque;
        if(unNiv_attaque>100){
            niv_attaque=100;
        }
        else if (unNiv_attaque<0){
            niv_attaque=0;
        }
        
    }
    
    @Override
   
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + ":" +niv_attaque;
    
        return chaine_a_retourner ;
    }

    public Object getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
