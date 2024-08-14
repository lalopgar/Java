/*Crea un programa que realice operaciones matematicas basicas suma, resta, multi y divi de dos numeros ingresados por el usuario. El usuario debe seleccionar la operacion que desea realizar*/

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
}