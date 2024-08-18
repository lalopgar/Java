/*Escribe un progrmama que solicite al usuario un numero de mes del 1 al 12 y muestre el numero de dias en ese mes.

package Ejemplos1;

import java.util.Scanner;
public class Ejemplo15{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un numero del 1 al 12: ");
        int numero= teclado.nextInt();

        if (numero == 1||numero ==3||numero ==5||numero ==7||numero ==8||numero ==10||numero ==12){
            System.out.print("31 días");
        } else if (numero == 4||numero ==6||numero ==9||numero ==11){
            System.out.print("30 dias");
        } else if (numero == 2){
            System.out.print("28 dias");
        } else{
            System.out.print("Error");
        }
    }
}*/

package Ejemplos1;
import java.util.Scanner;
public class Ejemplo15{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pulse un número de mes del 1 al 12: ");
        int numero = teclado.nextInt();

        if (numero == 1 || numero == 3 || numero == 5 || numero == 7 || numero == 8 || numero == 10 || numero == 12){
            System.out.println("Este mes tiene 31 días");
        } else if ( numero == 4|| numero == 6|| numero == 9|| numero == 11){
            System.out.println("Este mes tiene 30 días");
        } else if (numero == 2){
            System.out.println("Este mes tiene 28 días");
        } else{
            System.out.println("Error");
        }
    }
}