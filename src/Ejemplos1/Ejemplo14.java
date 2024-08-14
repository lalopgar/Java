//Pedir al usuario una nota del 0 l 10 y luego decirle que calificacion tiene en letra. < 5 suspenso 5 a 7 aprobado, de 7 a 8 notable, de 9 a 10 sobresaliente.

package Ejemplos1;
import java.util.Scanner;

public class Ejemplo14{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Introduce nota: ");
        Double nota = keyboard.nextDouble();
        if (nota >= 0 && nota < 5){              //de 0 a 4,99
            System.out.print("Suspenso");
        } else if (nota >= 5 && nota < 7){       //de 5 a 6,99
            System.out.print("Aprobado");
        } else if (nota >=7 && nota < 9){        //de 7 a 8,99
            System.out.print("Notable");
        } else if (nota >= 9 && nota <=10){      //de 9 a 9,99
            System.out.print("Sobresaliente");
        } else {
            System.out.print("Error");
        }
    }
}