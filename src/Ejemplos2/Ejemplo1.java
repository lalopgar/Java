/*package Ejemplos2;
public class Ejemplo1{
    public static void main(String args[]){

        System.out.println("Lara");                              //i = contador
        System.out.println("Lara");
        System.out.println("Lara");
        System.out.println("Lara");
        System.out.println("Lara");
        System.out.println("Lara");
        System.out.println("Lara");
        System.out.println("Lara");
        System.out.println("Lara");

        for(int i = 1 ; i <= 10 ; i++){

            System.out.println("Lara");

        }

        //  esto es un comentario

        for(int i= 0; i <= 10; i ++){
            System.out.println(i);
        }
    }
}*/

package Ejemplos2;
public class Ejemplo1{
    public static void main(String args[]){

        //IMPRIME NOMBRE

        for (int i = 1; i <=10; i++){
            System.out.print("\nLara");

        }

        // IMPRIME DEL 1 AL 10

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // IMPRIME DEL 1 AL 10 DE OTRA MANERA. ARIÁN LO HACE ASÍ, DESDE 0

        for (int i = 0; i <= 9; i++){
            System.out.println(i+1);
        }

        // IMPRIME DEL 10 AL 1

        for (int i = 10; i >= 1; i--){
            System.out.println(i);

        }

        //IMPRIME DEL 10 AL 1 DE OTRA MANERA

        for (int i = 9; i >= 0; i--){
            System.out.println(i+1);
        }

    }
}