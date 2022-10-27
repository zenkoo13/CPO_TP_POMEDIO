/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class TP2_convertisseurObjet_POMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur Convertisseur1 = new Convertisseur();//création de l'objet
        Convertisseur1.CelsiusVersFarenheit(Convertisseur1.KelvinVersCelsius(150));//définition des teempérature a convertir
        Convertisseur1.FarenheitVersKelvin(80);
        Convertisseur1.KelvinVersCelsius(Convertisseur1.FarenheitVersKelvin(290));
        Convertisseur1.CelsiusVersKelvin(55);
       
        Convertisseur Convertisseur2 = new Convertisseur();//création d'un deuxième objet
        Convertisseur2.KelvinVersCelsius(99);
        Convertisseur2.CelsiusVersFarenheit(Convertisseur2.KelvinVersCelsius(333));
        Convertisseur2.KelvinVersCelsius(345);
        
        Scanner sc = new Scanner(System.in);//création d'un objet scanner
        Convertisseur Convertisseur3 = new Convertisseur();
        System.out.println("Bonjour, saisissez une valeur : ");
        double valeur = sc.nextDouble();
             
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");//affichage
        System.out.println(" Celcius Vers Kelvin");
        System.out.println(" Kelvin Vers Celcius");
        System.out.println(" Farenheit Vers Celcius");
        System.out.println(" Celcius Vers Farenheit");
        System.out.println(" Kelvin Vers Farenheit");
        System.out.println(" Farenheit Vers Kelvin");
       
        int convutilisateur = sc.nextInt();
        double answer;
       
        if (convutilisateur == 1) {
            answer = Convertisseur3.CelsiusVersKelvin(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Kelvin");
        }
       
        if (convutilisateur == 2) {
            answer = Convertisseur3.KelvinVersCelsius(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Celcius");
        }
       
        if (convutilisateur == 3) {
            answer = Convertisseur3.FarenheitVersCelsius(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Celcius");
        }
       
        if (convutilisateur == 4) {
            answer = Convertisseur3.CelsiusVersFarenheit(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Farenheit");
        }
       
        if (convutilisateur == 5) {
            answer = Convertisseur3.KelvinVersFarenheit(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Farenheit");
        }
       
        if (convutilisateur == 6) {
            answer = Convertisseur3.FarenheitVersKelvin(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Kelvin");
        }
    }  
}
    
    

