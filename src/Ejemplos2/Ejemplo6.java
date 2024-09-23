/* Inserte un nombre y muestre todas las letras menos la primera y la penúltima. */

package Ejemplo6;
import java.util.Scanner;
public class Ejemplo6{
    public static void main(String args[]){

        //1º INSERTAR NOMBRE

            //1.1 CREAR UN SCANNER
        Scanner teclado = new Scanner(System.in);
            //1.2 SOLICITAR USUARIO NOMBRE
        System.out.print("Inserte nombre: ");

        //2º ALMACENAR VALOR O NOMBRE

        String nombre = teclado.nextLine();


        //3º MOSTRAR POR PANTALLA LA PALABRA

       for( int i = 0; i <= nombre.length()-1; i++){

           //3.1 EVITAR QUE APAREZCA LA PRIMERA LETRA

           //3.1.1 SI EL CONTADOR/ÍNDICE ES 0, NO HAGO NADA

           //3.2 EVITAR QUE APAREZCA LA PENÚLTIMA LETRA

           //3.2.1 SI EL CONTADOR/ÍNDICE ES = AL PENÚLTIMO, NO HAGO NADA

           if ( i != 0 && i != nombre.length()-2){
               System.out.println(nombre.charAt(i));
           }
       }
    }
}