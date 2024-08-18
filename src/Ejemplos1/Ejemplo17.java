/*Escribe un programa que permita al usuario convertir unidades de medida como de grados celsius a grados farenheit y de km a millas.
El programa debe preguntar al usuario qué tipo de conversión desea realizar.


package Ejemplos1;
import java.util.Scanner;
public class Ejemplo17{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Qué conversion quiere hacer? Pulse 1 para celsius a farenheit, pulse 2 para km a millas: ");
        int opcion = teclado.nextInt();

        if (opcion == 1){
            System.out.print("Introduce grados celsius: ");
            double grados = teclado.nextDouble();
            double n1 = (((grados*9)/5)+32);
            System.out.print("Resultado:  "+ n1);
        } else if (opcion == 2){
            System.out.print("Introduce km: ");
            double km = teclado.nextDouble();
            double n2 = (km/1.609);
            System.out.print("Resultado: " + n2);
        }

    }
}*/

package Ejemplos1;
import java.util.Scanner;
public class Ejemplo17{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Qué tipo de conversión quiere hacer? Pulse 1 para pasar de celsius a farenheit y 2 para pasar de km a millas: ");
        int pulse = teclado.nextInt();

        if (pulse == 1){
            System.out.print("Introduce grados celsius: ");
            double celsius = teclado.nextDouble();
            double n1 = (((celsius*9)/5)+32);
            System.out.println("Resultado en grados farenheit: " + n1);
        } else if (pulse == 2) {
            System.out.print("Introduce km: ");
            double km = teclado.nextDouble();
            double n2 = (km/1.609);
            System.out.println("Resultado: " + n2);
        }
    }
}