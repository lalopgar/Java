/*Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido*/

/*package PerezMontes;
import java.util.Scanner;
public class Ejercicio17{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte numero: ");
        int numero = teclado.nextInt();

        int numerosIntroducidos = 0;

        while (numero > 0){
            if (numero >= 0){
                numerosIntroducidos++;
                System.out.print("Inserte numero: ");
                numero = teclado.nextInt();
            }
        }

        System.out.println(numerosIntroducidos);
        System.out.print("FIN");
    }
}*/

package PerezMontes;
import java.util.Scanner;
public class Ejercicio17{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Inserte numero: ");
        int numero = teclado.nextInt();

        int numerosIntroducidos = 0;

        while (numero > 0){      //mientras numero sea positivo se va a estar repitiendo
            if (numero >= 0){    // si numero es positivo
                numerosIntroducidos++; // se le va añadiendo un 1 de 1 en 1
                System.out.print("Inserte numero: ");
                numero = teclado.nextInt();
            }
        }
        System.out.println(numerosIntroducidos); //total numeros introducidos
        System.out.print("FIN");

    }
}