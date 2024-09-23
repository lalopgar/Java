/*Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio12{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte un número entero del 0 al 10: ");
        int numero = teclado.nextInt();

        switch (numero){
            case 0:
                System.out.println("cero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;
        }
    }
}