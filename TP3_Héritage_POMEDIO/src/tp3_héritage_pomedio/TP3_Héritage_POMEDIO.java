/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_héritage_pomedio;

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
       
    }
    
}
