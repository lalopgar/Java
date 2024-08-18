/*Escribe todas las tablas de multiplicar desde la tabla del 1 hasta la del 10.*/
package Ejemplos2;
public class Ejemplo4{
    public static void main(String args[]){

        for (int i = 0; i <=10; i++ ){ // tabla del...

            System.out.println("TABLA DEL " + i);

            for(int j = 1; j <=10; j++){ // operacion

                System.out.println(i + " * " + j + " = " + (i*j));



            }

            System.out.println();

        }

    }
}