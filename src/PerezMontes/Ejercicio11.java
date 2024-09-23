/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...*/
package PerezMontes;
import java.util.Scanner;
public class Ejercicio11{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte nota de 0 a 10: ");
        int nota = teclado.nextInt();
            if (nota >=0 && nota <=4.99){
                System.out.println("Insuficiente");
        } else if (nota >=5 && nota <=5.99){
                System.out.println("Suficiente");
        } else if (nota >= 6 && nota <= 6.99){
                System.out.println("Bien");
        } else if (nota >=7 && nota <= 8.99){
                System.out.println("Notable");
        } else if (nota >= 9 && nota <=10){
                System.out.println("Sobresaliente");
        } else{
                System.out.println("Error");
        }
    }
}