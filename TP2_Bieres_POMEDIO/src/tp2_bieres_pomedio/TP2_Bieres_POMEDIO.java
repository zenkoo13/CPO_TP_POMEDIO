/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class TP2_Bieres_POMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
    BouteilleBiere Despe = new BouteilleBiere("Despe", 6.0,"Desperado") ;
    BouteilleBiere biere = new BouteilleBiere("1664", 7.0,"777") ;
    
    autreBiere.Décapsuler();
    Despe.Décapsuler();
    biere.Décapsuler();
    
    
    System.out.println(autreBiere) ;
    System.out.println(Despe) ;
    System.out.println(biere) ;

    }
}

   