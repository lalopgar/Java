/*CONTAR DEL 0 AL 101

 */



package Ejemplos2;
public class Ejemplo2{
    public static void main(String args[]){

        int numero = 101;
        int i = 0;

        while (i < numero){ // mientras esta condicion se cumpla (true).... se repite. Si no se cumple se para.
            System.out.println(i);
            i++;
        }
        //OTRA FORMA DE HACERLO
        // i = 101

        i = 0;

        do{
            System.out.println(i);
            i++;
        }while(i < numero);

    }
}