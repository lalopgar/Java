//Pedir por teclado al usuario un nombre e imprimir después ese nombre


/*package Ejemplos1;

import java.util.Scanner;  //Pedir por teclado

public class Ejemplo04{
    public static void main(String args[]){
        /*Scanner teclado = new Scanner(System.in);  //Pedir por teclado
        System.out.print("Escribe tu nombre y pulsa Enter: ");
        String nombre = teclado.nextLine();
        System.out.println("Tu nombre es " + nombre);  //Imprimir lo que el usuario ha escrito por teclado
    }
}*/

package Ejemplos1;

import java.util.Scanner;
public class Ejemplo04{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte un nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Tu nombre es " + nombre);
    }
}