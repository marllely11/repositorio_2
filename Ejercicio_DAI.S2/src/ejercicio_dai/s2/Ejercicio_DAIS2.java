package ejercicio_dai.s2;
import java.util.Scanner;

public class Ejercicio_DAIS2 {
 /* Hacer un programa que calcule el valor del DAI (Derecho Arancelario a la Importación) para 
 un vehículo del año 2010 utilizando la siguiente fórmula: 
DAI = (Valor Vehículo en USA – Depreciación - Flete – Seguro) * 0.25 
Depreciación = Valor Vehículo en USA * 0.10    */

    private static double dai;

    
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        double DAI=0.0, valorUSA=0.0, Depreciacion=0.10, flete=0.0, seguro=0.0;
        
        System.out.println("Ingrese el monto del vehiculo:");
        valorUSA =leer.nextDouble();
        System.out.println("Introduzca el valor del flete:");
        flete =leer.nextDouble();
        System.out.println("Introduzca el valor del seguro:");
        seguro =leer.nextDouble();
        String valor_de_dai = leer.nextLine();
        
        
       dai = calculoDAI(valorUSA, Depreciacion, flete, seguro);
       
       System.out.println("El valor del vehiculo es $" + valorUSA );
       System.out.println("El valor de la depreciacion es $" + Depreciacion);
       System.out.println("El valor del flete es $" + flete );
       System.out.println("El valor del seguro es $" + seguro );
       System.out.println("El valor del DAI es $" + dai );
       
     
       }
    
     public static double calculoDAI(double valorUSA, double Depreciacion, double flete, double seguro) {
    double dai = (valorUSA - Depreciacion -flete - seguro) * 0.25;
     return dai;    
     }
}
             
     
     
     
     

