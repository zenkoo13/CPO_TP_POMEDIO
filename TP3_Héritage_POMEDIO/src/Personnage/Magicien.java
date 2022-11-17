/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author kenzopomedio
 */
public class Magicien extends Personnage{
    boolean confirme = true;
    
    public Magicien(String unNom, int unNiv_vie, String unConfirme){
        
        super(unNom, unNiv_vie);
        if (unConfirme == "confirme"){
            confirme=true;
        }else{
            confirme=false;
        }
    }
     @Override
     public String toString(){
         String chaine_a_retourner;
         if(confirme==true){
            chaine_a_retourner=nom+":"+niv_vie+":"+confirme+":"+arme_en_main;  
         }else{
             chaine_a_retourner=nom+":"+niv_vie+":"+confirme+":"+arme_en_main;  
         } 
         return chaine_a_retourner;
     }
    
}
    

