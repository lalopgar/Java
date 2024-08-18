//Pedir al usuario un numero entero y ver si es par o impar

/*package Ejemplos1;
import java.util.Scanner;

public class Ejemplo11{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce numero");
        int numero = teclado.nextInt();

        if (numero % 2 == 0 ){                      //como se calcula el número par
            System.out.print("El numero es par");
        } else {
            System.out.print("El numero es impar");
        }
    }
}*/

package Ejemplos1;
import java.util.Scanner;
public class Ejemplo11{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}