/*pedir al usuario que seleccione una de las siguientes opciones:
1) km a millas 2) de millas a km 3)de celsius a farengeig 4) de farengeig a celsius.
Hay que utilizar un Switch*/

package Ejemplos1;
import java.util.Scanner;
public class Ejemplo18{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Selecciones una de las siguientes opciones:\n 1)km a millas\n 2)millas a km\n 3)celsius a farengeig\n 4)farengeig a celsius");
        System.out.print("\nInserte opcion: ");
        int opcion = teclado.nextInt();

        switch(opcion){
            case 1:
               System.out.print("Km a millas quieres: ");
               double km = teclado.nextDouble();
                double n1 = (km/1.609);
                System.out.print("Resultado: " + n1);
                break;
            case 2:
                System.out.print("millas a km quieres: ");
                double millas = teclado.nextDouble();
                double n2 = (millas*1.609);
                System.out.print("Resultado: " + n2);
                break;
            case 3:
                System.out.print("celsius a farengeig: ");
                double celsius = teclado.nextDouble();
                double n3 = ((celsius*9)/5)+32;
                System.out.print("Resultado: " + n3);
                break;
            case 4:
                System.out.print("farengeig a celsius: ");
                double farengeig = teclado.nextDouble();
                double n4 = (farengeig-32)*5/9;
                System.out.print("Resultado: " + n4);
                break;
            default:
                System.out.print("No has seleccionado la opcion correcta, selecciona del 1 al 4");
        }
    }
}