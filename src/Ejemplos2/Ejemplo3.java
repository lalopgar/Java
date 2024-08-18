/*Pedir al usuario el número de la tabla de multiplicar que desea calcular.
Luego mostrar toda la tabla de multiplicar.
Ejemplo número 5, 5 * 1 = 5, 5*2=10...
 */

package Ejemplos2;
import java.util.Scanner;
public class Ejemplo3{
    public static void main(String args[]){

        System.out.println("INICIO PROGRAMA");

        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Qué número de la tabla de multiplicar quiere calcular?: ");
        int numero = teclado.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }

        System.out.println("FINAL PROGRAMA");

    }
}