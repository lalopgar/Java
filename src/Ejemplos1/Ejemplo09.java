//Pedir por teclado que inserte un numero entero y hacer una condicion IF ELSE  AND && OR || mayor de edad

//TABLAS DE VERDAD -> AND si true y true entonces true y resto false. Con OR si false y false entronces false resto true

/*package Ejemplos1;

import java.util.Scanner;

public class Ejemplo09{
    public static void main(String args[]){
       /* Scanner teclado = new Scanner(System.in);
        System.out.print("inserte su edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18 && edad <= 100){ //(false or true) = true
            // (false and true) = false  BUSCAR TABLAS DE VERDAD AND Y OR       && ||

            System.out.print("Puedes pasar");

        } else {
            System.out.print("No puedes pasar");
        }


    }*/
package Ejemplos1;
import java.util.Scanner;
public class Ejemplo09{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18 && edad <=100){
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }
    }
}