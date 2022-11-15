/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_héritage_pomedio;

import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author kenzopomedio
 */
public class TP3_Héritage_POMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee excalibur = new Epee ("Excalibur", 7, 5);
        Epee durandal = new Epee ("Durandal", 4, 7);
        
        Baton chene = new Baton ("Chêne", 4, 5);
        Baton charme = new Baton ("Charme", 5, 6);
        
        System.out.println(excalibur);
        System.out.println(durandal);
        
       
        
        System.out.println(chene);
        System.out.println(charme);
        
        ArrayList<Arme> tab = new  ArrayList<Arme>();
        tab.add(excalibur);
        tab.add(durandal);
        tab.add(chene);
        tab.add(charme);
        
        System.out.print(tab.get(0));
        System.out.print(tab.get(1));
        System.out.print(tab.get(2));
        System.out.print(tab.get(3));
                
       
    
    Magicien Gandalf= new Magicien("Gandalf",65, "confirme");
    Magicien Garcimore= new Magicien("Garcimore", 44, "novice");
    
    Guerrier Conan= new Guerrier("Conan", 78, "à pied");
    Guerrier Lannister= new Guerrier("Lannister", 45, "à cheval");
    
    System.out.println(Gandalf);
    System.out.println(Garcimore);
    
    System.out.println(Conan);
    System.out.println(Lannister);
    
    
    
    ArrayList<Personnage> tab1 = new  ArrayList<Personnage>();
    tab1.add(Gandalf);
    tab1.add(Garcimore);
    tab1.add(Conan);
    tab1.add(Lannister);
    
    System.out.print(tab1.get(0));
    System.out.print(tab1.get(1));
    System.out.print(tab1.get(2));
    System.out.print(tab1.get(3));
    
    }
}
    
    
    
    
    


