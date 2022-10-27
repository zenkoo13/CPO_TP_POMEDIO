/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class Personne {
  
    String nom;
    String prenom;
    int nbrVoitures;
    Voiture [] liste_voitures ; // tableau contenant les voitures
    public Personne (String unNom, String unPrenom){
        nom=unNom;
        prenom=unPrenom;
        nbrVoitures=0;
        liste_voitures= new Voiture[3];
    }
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire!=null){
            System.out.println("Erreur, la voiture est volee");
            return false;           
        }
        else if (nbrVoitures>=3){
            System.out.println("Erreur, la personne a deja 3 voitures");
            return false;
        }
        else {
            int caseTableau=nbrVoitures; 
            nbrVoitures+=1;
            voiture_a_ajouter.Proprietaire=this; 
            this.liste_voitures[caseTableau]=voiture_a_ajouter;
            return true;
            
        }
    }
@Override
public String toString() {
String descrp_voiture;
descrp_voiture = nom + "" + prenom;
return descrp_voiture ;
}
}



    

