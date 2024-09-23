/*Pedir dos números y decir cual es el mayor*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio5{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce número 1: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce número 2: ");
        int n2 = teclado.nextInt();

            if (n1 < n2 ){
                System.out.println("Número 2 es mayor que número 1");
            } else {
                System.out.println("Número 1 es mayor que número 2");
            }
    }
}
