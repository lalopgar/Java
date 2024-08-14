//Pedir la edad y decir que puede pasar si es menos de edad y si es menor de edad no puede pasar.

package Ejemplos1;
import java.util.Scanner;

public class Ejemplo19{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Qué edad tienes?: ");
        int edad = teclado.nextInt();

        if (edad >= 18 && edad <= 100){
            System.out.print("Puedes pasar");
        } else {
            System.out.print("No puedes pasar");
        }


       /* OPERADOR TERNARIO

         se puede poner como arriba con el if o con el operador ternario. Adrián lo pone con el if.

        String pasar = (edad >= 18)? "Si":"No";  //esto hace lo mismo que un IF ELSE
        System.out.print("\n¿Puedo pasar? " + pasar);
    }
} */