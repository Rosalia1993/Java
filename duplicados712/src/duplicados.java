/**
 * Created by ROSSV on 13/07/2017.
 */
import java.util.Scanner;

public class duplicados {

    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
        System.out.println("deme 5 numeros entre 10 y 100");

        int numero1=entrada.nextInt();
        int numero2=entrada.nextInt();
        int numero3=entrada.nextInt();
        int numero4=entrada.nextInt();
        int numero5=entrada.nextInt();

        int arreglo[]={numero1,numero2,numero3,numero4,numero5};

        if(numero1!=numero2 && numero1!=numero3 && numero1!=numero4 &&
                numero1!=numero5 &&numero2!=numero3 &&  numero2!=numero4 &&
                numero2!=5 && numero3!=numero1 && numero3!=numero4 && numero3!=numero5
                && numero4!=numero5 && numero1!=numero5) {
            for (int index = 0; index < arreglo.length; index++) {
                System.out.println("los elementos introducidos son: " + arreglo[index]);
            }
        }
        else{
            System.out.println("hay  numeros repetidos " );
        }

    }
}
