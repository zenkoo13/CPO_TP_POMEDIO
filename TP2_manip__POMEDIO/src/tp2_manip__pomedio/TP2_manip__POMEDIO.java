/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip__pomedio;

/**
 *
 * @author kenzopomedio
 */
public class TP2_manip__POMEDIO {

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


        assiette2=assiette1;
        assiette1=assiette3;
    
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        
    //q6)la première ligne Moussaka assiette666 est fausse
    //la deuxième ligne Moussaka assiette667 est fausse
    //la référence de l'objet tartiflette ne peut pas référencer l'objet moussaka
    
    Moussaka tab[]=new Moussaka[10];//tableau de 10 cases
    for (int i=0;i<10;i++){//chaque case prend une moussaka
        tab[i]=new Moussaka(500);//on associe a chaque case de moussaka un nbr de calories, l'opération se répète 10 fois
        
     System.out.println(tab[0].nbCalories);
    }
     
    }   
}
    


    
    

