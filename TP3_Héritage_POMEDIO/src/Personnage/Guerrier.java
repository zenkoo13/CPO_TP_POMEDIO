/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author kenzopomedio
 */
public class Guerrier extends Personnage {
    boolean cheval=true;
    
    public Guerrier(String unNom, int unNiv_vie, String unCheval){
        
        super(unNom, unNiv_vie);
        if(unCheval == "à cheval"){
            cheval=true;
        }else{
            cheval=false;
        }
    }
    
      @Override
     public String toString(){
         String chaine_a_retourner;
         if(cheval==true){
            chaine_a_retourner=nom+":"+niv_vie+":"+cheval+":"+arme_en_main;            

         }else{
             chaine_a_retourner=nom+":"+niv_vie+":"+":"+arme_en_main;  
         } 
         return chaine_a_retourner;
     }
    
    
    
}
