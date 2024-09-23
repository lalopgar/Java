/*Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio9{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 9.999: ");
        int numero = teclado.nextInt();

       if (numero >=0 && numero < 10){
           System.out.println("1 cifra");
       } else if ( numero >=10 && numero < 100){
           System.out.println("2 cifras");
       } else if (numero >=100 && numero < 1000){
           System.out.println("3 cifras");
       }else if (numero >=1000 && numero < 10000){
           System.out.println("4 cifras");
       } else {
           System.out.println("Error");
       }
    }
}