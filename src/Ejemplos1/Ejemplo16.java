/*Crea un programa que calcule el precio final de un producto después de aplicar un descuento.
El usuario debe ingresar el precio original y el porcenaje de descuento.

package Ejemplos1;
import java.util.Scanner;

public class Ejemplo16{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese precio original: ");
        double precio = teclado.nextDouble();
        System.out.print ("Ingrese porcentaje de descuento: ");
        int porcentaje = teclado.nextInt();
        double descuento = (precio*porcentaje/100);                   //variable con la operación
        System.out.println("El descuento es " + descuento + " €");
        System.out.print("TOTAL: " + (precio - descuento) + " €");
    }
}*/

package Ejemplos1;
import java.util.Scanner;
public class Ejemplo16{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte precio: ");
        double precio = teclado.nextDouble();
        System.out.print("Inserte porcentaje de descuento: ");
        int porcentaje = teclado.nextInt();
        double descuento = ((precio*porcentaje)/100);
        System.out.println("Descuento aplicado de " + descuento + "€");
        System.out.println("TOTAL: " + (precio - descuento) + "€" );
    }
}