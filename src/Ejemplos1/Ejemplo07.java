//Pedir por teclado un número entero y luego realizar la condición IF. Si el número es mayor que 5 imprimir por pantalla que el número es mayor que 5.


/*package Ejemplos1;
import java.util.Scanner;

public class Ejemplo07{
    public static void main(String args[]){
       /* Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte un numero entero: ");
       int numero = teclado.nextInt();

       if (numero > 5){
           System.out.println("El número es mayor que 5");   //Condición si el número es mayor que 5 imprimir por pantalla que el número es mayor que 5

    }
}*/

package Ejemplos1;

import java.util.Scanner;

public class Ejemplo07{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte número: ");
        int numero = teclado.nextInt();

        if (numero > 5 ){
            System.out.println("El número es mayor que 5");
        }
    }
}