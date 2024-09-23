/*Pedir un número e indicar si es positivo o negativo*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int número = teclado.nextInt();

            if (número < 0){
                System.out.println("El número es negativo");
            } else if (número >= 0){
                System.out.println("El número es positivo");
            }
    }
}