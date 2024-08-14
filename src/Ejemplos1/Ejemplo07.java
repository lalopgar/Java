//Pedir por teclado un numero entero y luego realizar la condicion IF si el numero es mayor que 5 imprimir por pantalla que el numero es mayor que 5


/*package Ejemplos1;
import java.util.Scanner;

public class Ejemplo07{
    public static void main(String args[]){
       /* Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte un numero entero: ");
       int numero = teclado.nextInt();

       if (numero > 5){
           System.out.println("El número es mayor que 5");   //Condicion si el numero es mayor que 5 imprimir por pantalla que el numero es mayor que 5

    }
}*/

package Ejemplos1;

import java.util.Scanner;
public class Ejemplo07{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        if (numero > 5){
            System.out.print("El numero es mayor que 5");
        }
    }
}