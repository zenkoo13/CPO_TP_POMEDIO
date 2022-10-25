/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class TP2_manip_POMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Tartiflette assiette1 = new Tartiflette(500) ;//création d'un objet
        Tartiflette assiette2 = new Tartiflette(600) ;

        Tartiflette assiette3 = assiette2 ;// il y a 3 tartiflettes créées. Assiette 2 et assiette 3 sont deux tartiflettes différentes mais ont le même nombre de calories

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;//affichage
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ; 

}
    
}
