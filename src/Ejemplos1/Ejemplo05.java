//Pedir por teclado que se inserten dos números y luego imprimir el total de su multiplicación


/*package Ejemplos1;

import java.util.Scanner;

public class Ejemplo05{
    public static void main(String args[]){
        /*Scanner teclado = new Scanner(System.in); // Pedir por teclado
        System.out.print("Inserte el primer número: ");
        int numero = teclado.nextInt();                 //Variable por teclado de un numero entero
        System.out.print("Inserte el segundo número: ");
        int numero2 = teclado.nextInt();
        System.out.println("La multiplicación de los dos números es " + (numero*numero2)); //imprimir resultado y como se hace la multiplicacion
    }
}*/

package Ejemplos1;

import java.util.Scanner;
public class Ejemplo05{
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       System.out.print("Inserte primer número:");
       int numero1 = teclado.nextInt();
       System.out.print("Inserte segundo número:");
       int numero2 = teclado.nextInt();
    System.out.println("El total de la multiplicación de ambos números es " + (numero1*numero2));

    }
}