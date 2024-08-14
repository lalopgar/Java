//Pedir dos numeros al usuario y ver cual es mayor o si son iguales

package Ejemplos1;
import java.util.Scanner;

public class Ejemplo10{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero 1");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce numero 2");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2){
            System.out.print("El numero 1 es mayor que numero 2");
        } else if (numero1 < numero2){
            System.out.print("El numero 1 es menos que el numero 2");
        } else {
            System.out.print("Ambos numeros son iguales");
        }
    }
}