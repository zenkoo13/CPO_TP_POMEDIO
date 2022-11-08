/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_héritage_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class Baton extends Arme{
   int age;
   
   public Baton(String unNom, int unNiv_attaque, int unAge){
      
       super(unNom, unNiv_attaque);
       if(unAge>100){
           age=100;
   
       }else if(unAge<0){
           age=0;
       }else{
           age=unAge;
       }
   }
     
    @Override
   
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + ":" +niv_attaque+":"+age+"ans";
    
        return chaine_a_retourner ;
    
    
   }
}
