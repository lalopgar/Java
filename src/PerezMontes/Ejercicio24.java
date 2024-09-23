/*Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio24{
    public static void main (String args[]){
        Scanner  teclado = new Scanner(System.in);

        int sumaTotal = 0;

        for (int i = 1; i <= 10; i++){

            System.out.print("Inserte sueldo: " + (i) + " : ");
           int sueldo = teclado.nextInt();
            sumaTotal = sueldo + sumaTotal;


            /*if (sueldo >= 1000){

                System.out.print("Hay " +   i  + " que superan los 1000€");*/
            }
            System.out.println("SUMA TOTAL: " + sumaTotal);
            System.out.println("FIN");

        }
    }
