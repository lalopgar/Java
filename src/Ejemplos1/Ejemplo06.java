//Pedir por teclado un numero decimal y luego imprimir su ceil,floor,potencia y raiz cuadrada


/*package Ejemplos1;

import java.util.Scanner;

public class Ejemplo06{
    public static void main(String args[]){
        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un número con decimales: ");
        double numero = teclado.nextDouble();                  //variable por teclado de un numero decimal
        System.out.println("El ceil es: " + Math.ceil(numero)); //redondea hacia arriba
        System.out.println("El floor es: " + Math.floor(numero)); //redondea hacia abajo
        System.out.println("La potencia es: " + Math.pow(numero,3)); //el numero elevado a 3, operacion matematica
        System.out.println("La raiz es: " + Math.sqrt(numero)); // raiz cuadrada

        teclado.close(); //para cerrar el teclado siempre que acabe de utilizarlo porque si no puede dar errores
        /*System.out.print("Escribe un número con decimales: ");
        numero = teclado.nextDouble();
    }
}*/

package Ejemplos1;

import java.util.Scanner;
public class Ejemplo06{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte un número decimales: ");
        double numero = teclado.nextDouble();

    System.out.println("El ceil es: " + Math.ceil(numero));
    System.out.println("El floor es: " + Math.floor(numero));
    System.out.println("La potencia es: " + Math.pow(numero,3));
    System.out.println("La raíz es: " + Math.sqrt(numero));

    teclado.close();

    }
}