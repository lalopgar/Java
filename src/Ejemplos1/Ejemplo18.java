/*pedir al usuario que seleccione una de las siguientes opciones:
1) km a millas 2) de millas a km 3)de celsius a farenheit 4) de farenheit a celsius.
Hay que utilizar un Switch

package Ejemplos1;
import java.util.Scanner;
public class Ejemplo18{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Selecciones una de las siguientes opciones:\n 1)km a millas\n 2)millas a km\n 3)celsius a farenheit\n 4)farenheit a celsius");
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
                System.out.print("celsius a farenheit: ");
                double celsius = teclado.nextDouble();
                double n3 = ((celsius*9)/5)+32;
                System.out.print("Resultado: " + n3);
                break;
            case 4:
                System.out.print("farenheit a celsius: ");
                double farenheit = teclado.nextDouble();
                double n4 = (farenheit-32)*5/9;
                System.out.print("Resultado: " + n4);
                break;
            default:
                System.out.print("No has seleccionado la opcion correcta, selecciona del 1 al 4");
        }
    }
}*/
package Ejemplos1;
import java.util.Scanner;
public class Ejemplo18{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Seleccione una de las siguientes opciones:\n1.Km a millas\n2.Millas a Km\n3.Celsius a farenheit\n4.Farenheit a celsius.");
        System.out.print("\nInserte opción: ");
        int opcion = teclado.nextInt();

        switch(opcion){
            case 1:
               System.out.print("¿Cuántos km quieres pasar a millas?: ");
               double km = teclado.nextDouble();
               double n1 = (km/1.609);
               System.out.print("Total: " + n1 + "millas");
               break;
            case 2:
                System.out.print("¿Cuántas millas quieres pasar a km?: ");
                double millas = teclado.nextDouble();
                double n2 = (millas*1.609);
                System.out.print("Total: " + n2 + "km");
                break;
            case 3:
                System.out.print("¿Cuántos celsius quieres pasar a farenheit?: ");
                double celsius = teclado.nextDouble();
                double n3 = ((celsius*9)/5)+32;
                System.out.print("Total: " + n3 + "farenheit");
                break;
            case 4:
                System.out.print("¿Cuántos farenheit quieres pasar a celsius?: ");
                double farenheit = teclado.nextDouble();
                double n4 = (farenheit-32)*5/9;
                System.out.print("Total: " + n4 + "celsius");
                break;
            default:
                System.out.print("No has seleccionado la opcion correcta, selecciona del 1 al 4");
        }
    }
}