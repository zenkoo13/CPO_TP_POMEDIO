/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_pomedio;

/**
 *
 * @author kenzopomedio
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur(){
    int nbConversions=0;
    
}
    public double CelsiusVersKelvin (double temperature){ //variable convertissant le température en unité demandé
      temperature=temperature+273.15;// calcul pour convertir la température voulu
      return temperature;//retourne le résultat en unité demandée
    }

    public double KelvinVersCelsius(double temperature){
      temperature=temperature-273.15;
      return temperature;
}
    public double FarenheitVersCelsius(double temperature){
      temperature=(temperature-32)*9/5;
      return temperature;
}
    public double CelsiusVersFarenheit(double temperature){
      temperature=(temperature*5/9)+32;
      return temperature;
}
    public double FarenheitVersKelvin(double temperature){
      temperature=(temperature-32)*5/9+273;
      return temperature;
}
    
    public double KelvinVersFarenheit(double temperature){
      temperature=(temperature-273)*1.8+32;
      return temperature;

}
@Override
public String toString () {
  return "nb de conversions"+ nbConversions;
}
}