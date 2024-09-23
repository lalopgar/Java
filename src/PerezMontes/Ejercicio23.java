/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
la cantidad de ceros.*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio23{
    public static void main(String args[]){


        Scanner teclado = new Scanner(System.in);

        int SumanumerosPositivos = 0;
        int SumanumerosNegativos= 0;
        int cantidadNumerosPositivos = 0 ;
        int cantidadNumerosNegativos = 0;
        int cantidadCeros = 0;
        double mediaPositiva = 0;
        double mediaNegativa = 0;


        for (int i = 1; i <=10; i++ ){ // LARA LE EMPIEZA A DAR COSAS A ADRIAN

            System.out.print("Inserte número: ");
            int numero = teclado.nextInt();


            if ( numero > 0){
                SumanumerosPositivos = SumanumerosPositivos + numero;
                cantidadNumerosPositivos= cantidadNumerosPositivos + 1; // la cantidad de numeros va aumentando de uno en uno //cantidadNumerosPositivos ++

            } else if ( numero < 0){
                SumanumerosNegativos = SumanumerosNegativos + numero;
                cantidadNumerosNegativos= cantidadNumerosNegativos + 1;
            } else {
                cantidadCeros = cantidadCeros + 1;
            }

        }

        if(cantidadNumerosPositivos == 0){
            System.out.println("NO HAY NUMEROS POSITIVOS");
        } else {
            mediaPositiva = SumanumerosPositivos/cantidadNumerosPositivos;
            System.out.println("MEDIA POSITIVA ES : " + mediaPositiva);
        }

        if (cantidadNumerosNegativos == 0){
            System.out.println("NO HAY NUMEROS NEGATIVOS");
        } else {
            mediaNegativa= SumanumerosNegativos/cantidadNumerosNegativos;
            System.out.println("MEDIA NEGATIVA ES : " + mediaNegativa);
        }
        System.out.println("CANTIDAD DE CEROS ES: " + cantidadCeros);
    }
}