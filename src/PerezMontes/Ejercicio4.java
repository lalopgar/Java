/*Pedir dos números y decir si uno es múltiplo del otro.*/
package PerezMontes;
import java.util.Scanner;
public class Ejercicio4{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce número 1: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce número 2 :");
        int n2 = teclado.nextInt();

        if(n1 % n2 == 0){
            System.out.println("Múltiplos");
        } else {
            System.out.println("No son múltiplos");
        }
    }
}