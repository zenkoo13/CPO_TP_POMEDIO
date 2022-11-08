/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_héritage_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class Epee extends Arme {
    int indice;
    
    public Epee(String unNom, int unNiv_attaque, int unIndice){
        super(unNom, unNiv_attaque);
    if(unIndice>100){
       indice=100;
    }else if (unIndice<0){
        indice=0;
    }else{
        indice=unIndice;
        }
    }
    @Override
   
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + ":" +niv_attaque +":" +indice;
    
        return chaine_a_retourner ;
    }
    
        
}  


