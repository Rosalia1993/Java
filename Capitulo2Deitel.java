
package capitulo2deitel;

import java.util.Scanner;
/**
 *
 * @author Rosalia
 */
public class Capitulo2Deitel {

    public static void main(String[] args) {
        
        // Ejercicio 2.14 
       //impresion de cadenas con diferentes lineas
       
        System.out.println("impresion con println: 1 2 3 4 ");
        
        System.out.print("impresion con print 1");
        System.out.print(" 2");
        System.out.print(" 3");
        System.out.print(" 4");
        
        System.out.printf("\n%s%s%s%s%s","impresion con printf"," 1"," 2"," 3"," 4\n");
        
        
        //Ejercicio 2.15
        //recibe dos numeros de usuario e imprime suma, producto y division
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Agrege el primer numero:");
        float num1=entrada.nextFloat();
        
        System.out.println("\nAgrege el segundo numero:");
        float num2=entrada.nextFloat();
        
        System.out.println("la suma es: "+ (num1+num2));
        System.out.println("la resta es: "+ (num1-num2));
        System.out.println("la multiplicacion es: "+ (num1*num2));
        
        if(num2>0){
          System.out.println("la division es: "+(num1/num2));
        }
        else{
            System.out.println("division fuera de rango");
        }
        
        //Ejercicio 2.16
        //recibe dos numeros del usuario y determina si son iguales, mayor o menor
             
        System.out.println("primer entero:");
        int numero1 = entrada.nextInt();
        
        System.out.println("\nsegundo entero:");
        int numero2 = entrada.nextInt();
        
        
        if(numero1 > numero2){
            System.out.println("el numero "+ numero1 +" es mas grande que "+ numero2);
        }
         if(numero1 == numero2){
            System.out.println("el numero "+ numero1 +" es igual al "+ numero2);
        }
        if(numero1 < numero2){
            System.out.println("el numero "+ numero1 +" es menor que "+ numero2);
        }
      
        
        //Ejercicio 2.17
        //recibe tres numeros y determina promedio, suma,y cual es el mas grande
        
        System.out.println("primer numero:");
        int entero1 = entrada.nextInt();
        
        System.out.println("segundo numero:");
        int entero2 = entrada.nextInt();
        
        System.out.println("tercer numero:");
        int entero3 = entrada.nextInt();
        
        System.out.println("la suma es: " + (entero1+entero2+entero3));
        System.out.println("el promedio es: " + (entero1+entero2+entero3)/3);
    }
    
}
