/*Pedir un número entre 0 y 9.999, decir si es capicúa (para 3 cifras)*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio10{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entre 0 y 9.999: ");
        int numero = teclado.nextInt();
        String numeroaletra = ""+numero;

        if (numeroaletra.charAt(0) == '1'){
            System.out.print("es 1 la primera cifra");

        }
    }
}