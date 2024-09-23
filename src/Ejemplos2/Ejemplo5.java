/* Pedir al usuario una palabra y devolverla al revés. Ejemplo LARA > ARAL .*/

package Ejemplos2;                                       //palabra.length() = cantidad de letras que tiene la palabra
import java.util.Scanner;
public class Ejemplo5{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String palabra = teclado.nextLine();

        for (int i = 0; i < palabra.length(); i++){
            System.out.print(" " + palabra.charAt(i));
        }

        System.out.println();

        //HACER LA PALABRA AL REVÉS
        for (int i = palabra.length()-1; i >= 0; i--) {
            System.out.print(" " + palabra.charAt(i));
        }
    }
}