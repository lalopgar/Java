/*Crea un programa que realice operaciones matematicas basicas suma, resta, multi y divi de dos numeros ingresados por el usuario. El usuario debe seleccionar la operacion que desea realizar*/

package Ejemplos1;

import java.util.Scanner;
public class Ejemplo13{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce un numero: ");
        int numero2 = teclado.nextInt();
        System.out.print("Pulse +, -, *, /: ");
        char pulse = teclado.nextLine().charAt(0);       //para char y siempre ''

        if (pulse == '+'){                                  //IF si...
            System.out.print((numero1+numero2));
        } else if (pulse == '-'){                           // ELSE IF si....
            System.out.print((numero1-numero2));
        } else if (pulse == '*'){
            System.out.print((numero1*numero2));
        } else if (pulse == '/' ){
            System.out.print((numero1/numero2));
        } else {                                          //ELSE si no...
            System.out.print("Error");
        }
    }
}