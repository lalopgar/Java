/*Pedir tres números y mostrarlos ordenados de mayor a menor.*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio8{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);
        System.out.print("Introduce n1: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce n2: ");
        int n2 = teclado.nextInt();
        System.out.print("Introduce n3: ");
        int n3 = teclado.nextInt();

        if(n1>n2 && n2>n3){
            System.out.println( n1 + " , " + n2 + " , " + n3);
        } else if ( n1>n3 && n3>n2){
            System.out.println( n1 + " , " + n3 + " , " + n2);
        } else if( n2>n1 && n1>n3){
            System.out.println( n2 + " , " + n1 + " , " + n3);
        } else if (n2>n3 && n3>n1){
            System.out.println( n2 + " , " + n3 + " , " + n1);
        } else if (n3>n1&&n1>n2){
            System.out.println( n3 + " , " + n1 + " , " + n2);
        } else if( n3>n2&&n2>n1){
            System.out.println( n3 + " , " + n2 + " , " + n1);
        }

    }
}