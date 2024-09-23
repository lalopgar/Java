/*Pedir dos números y mostrarlos ordenados de mayor a menor.*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio7{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce n1: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce n2: ");
        int n2 = teclado.nextInt();

            if ( n1 > n2){
                System.out.println(n1 + " , " + n2);
            } else if ( n1 < n2){
                System.out.println(n2 + " , " + n1);
            } else {
                System.out.println(n1 + " = " + n2);
            }
    }
}