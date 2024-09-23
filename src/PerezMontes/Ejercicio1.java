/*Pedir el radio de un círculo y calcular su área. A=PI*r^2.*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Díme el radio del círculo: ");
        double radio = teclado.nextDouble();
        System.out.println("El área del círculo es " + (Math.PI*Math.pow(radio,2)));  // PI = Math.PI
                                                                                     // potencia = Math.pow (nº que quiero elevar, al nº que lo elevo
    }
}