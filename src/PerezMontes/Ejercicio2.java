/*Pedir dos números y decir si son iguales o no.*/
package PerezMontes;
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce número 1: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce número 2: ");
        int n2 = teclado.nextInt();

            if (n1 < n2){
                System.out.println("El primer número es menor que el segundo número.");
            } else if ( n1 > n2){
                System.out.println("El primero número es mayor que el segundo número. ");
            } else {
                System.out.println("Los dos números son iguales. ");
            }
    }
}