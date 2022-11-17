/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_héritage_pomedio;

import Personnage.Personnage;
import Personnage.Magicien;
import Personnage.Guerrier;
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
        
         for (int i=0; i<4;i++){
            System.out.print(tab.get(i));
        
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
    
    for (int j=0; i<4;i++){
            System.out.print(tab1.get(i));
        }
    
    System.out.print(tab1.get(0));
    System.out.print(tab1.get(1));
    System.out.print(tab1.get(2));
    System.out.print(tab1.get(3));
    
    }
         
        Magicien Kader = new Magicien ("Kader bueno", 68, "confirme");
        Guerrier Cyborg = new Guerrier("Erling Haaland",100,"à cheval");
       
        Epee Saphir  = new Epee ("Saphir", 49, 56);
        Epee Rubi = new Epee ("Rubi", 77, 41);
        Epee Emeraude = new Epee ("Emeraude", 88, 18);
       
        Baton Diamant = new Baton("Diamant",67,4);
        Baton Platine = new Baton ("Platine", 90, 7);
        Baton Cristal = new Baton ("Cristal", 24, 8);
       
       Cyborg.ajouterArme(Emeraude);
       Cyborg.ajouterArme(Platine);
       Cyborg.ajouterArme(Cristal);
       Cyborg.EquipArme("Emeraude");
       
       Kader.ajouterArme(Rubi);
       Kader.ajouterArme(Diamant);
       Kader.ajouterArme(Saphir);
       Kader.EquipArme("Saphir");
       
       System.out.println(Cyborg);
       System.out.println(Kader);
     
       
    }
}


    
    
    
    
    


