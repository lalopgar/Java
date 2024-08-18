/*Crea un programa que realice operaciones matemáticas básicas suma, resta, multi y divi de dos números ingresados por el usuario.
El usuario debe seleccionar la operación que desea realizar.

package Ejemplos1;

import java.util.Scanner;
public class Ejemplo12{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce un numero: ");
        int numero2 = teclado.nextInt();
        System.out.print("Pulse 1+, 2-, 3*, 4/: ");
        int pulse = teclado.nextInt();

        if (pulse == 1){                                  //IF si...
            System.out.print((numero1+numero2));
        } else if (pulse == 2){                           // ELSE IF si....
            System.out.print((numero1-numero2));
        } else if (pulse == 3){
            System.out.print((numero1*numero2));
        } else if (pulse == 4 ){
            System.out.print((numero1/numero2));
        } else {                                          //ELSE si no...
            System.out.print("Error");
        }
    }
}*/

package Ejemplos1;
import java.util.Scanner;
public class Ejemplo12{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa número 1: ");
        int n1 = teclado.nextInt();
        System.out.print("Ingresa número 2: ");
        int n2 = teclado.nextInt();
        System.out.print("Pulse 1+, 2-, 3*, 4/: ");
        int pulse = teclado.nextInt();

        if (pulse == 1){
            System.out.println((n1+n2));
        } else if (pulse == 2){
            System.out.println((n1-n2));
        } else if(pulse == 3){
            System.out.println((n1*n2));
        } else if(pulse == 4){
            System.out.println((n1/n2));
        } else{
            System.out.println("Error");
        }

    }
}