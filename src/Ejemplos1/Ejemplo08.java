//Pedir por teclado que se inserte una nota y realizar una condicion IF con simbolo de AND && aprobado


/*package Ejemplos1;

import java.util.Scanner;

public class Ejemplo08{
    public static void main(String args[]){
       /* Scanner teclado = new Scanner(System.in);
        System.out.print("Alumno, inserta tu nota: ");
        double nota = teclado.nextDouble();            //se utiliza double porque la nota puede llevar decimales
        if (nota >= 5 && nota <= 10){ //>= mayor igual que <= menor igual que
            System.out.println("Aprobado");
        }

    }*/
package Ejemplos1;

import java.util.Scanner;

public class Ejemplo08{
    public static void main(String args[]){
        Scanner teclado=new Scanner (System.in);
        System.out.print("Inserte una nota: ");
        double nota = teclado.nextDouble();

        if (nota >= 5 && nota <=10){
            System.out.println("Aprobado");
        }
    }
}
