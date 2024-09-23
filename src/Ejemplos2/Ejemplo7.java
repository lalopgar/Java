/* Pedir al usuario que escriba el número 0.
Si el usuario escribe otro número, continuar pidiendo que escriba el número 0.

Si el usuario escribe el número 0, entonces el programa termina diciendo ADIÓS.
 */

package Ejemplos2;
import java.util.Scanner;
public class Ejemplo7{
    public static void main(String args[]){

        // 0º MIENTRAS QUE EL USUARIO NO ESCRIBA 0...BUCLE                                     != diferente,no igual

        int numero;

        do{
            //1º PEDIR EL NÚMERO POR ESCANER

            Scanner teclado = new Scanner(System.in);

            System.out.print("Escribe el número: ");

            //2º INSERTAR VALOR

            numero = teclado.nextInt();

            //3º IF ME DICES 0 ENTONCES ADIÓS

            if (numero == 0 ){
                System.out.println("Adiós");
            }


        } while(numero != 0); // mientras que esta condicion sea verdadera, si es falsa termina

    }
}


