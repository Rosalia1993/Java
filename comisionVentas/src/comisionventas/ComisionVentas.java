package comisionventas;
import java.util.Scanner;

/**
 *
 * @author ROSSV
 */
public class ComisionVentas {
  public static void main(String[] args) {
  
 Scanner salario= new Scanner(System.in);
   int []ventas= new int [3];
   int salarioBase=200;
   int posicion;
   
 for(posicion=0; posicion<ventas.length;posicion++){
   System.out.println("Deme el salario del empleado:");
   ventas [posicion]=salario.nextInt();
 }
        //imprimir salarios
    System.out.println("los salarios almacenados en el arreglo son: ");
    
    
    for(int i=0; i<ventas.length; i++){
       double bono=ventas[i]*0.09;
    double salarioTotal=salarioBase+bono;
        System.out.println(ventas[i]+" salario total "+ salarioTotal);
       }
    
   /* for(int cuenta=0; cuenta<ventas.length;cuenta++){
       if(cuenta==100)
           System.out.printf("%10d: ",100);
       else 
           System.out.printf("%02d-%02d:", cuenta*10,cuenta*10+9);
       
       for(int estrellas=0;estrellas<ventas[cuenta];estrellas++){
           System.out.print("*");
       }
       
    }*/ 
 }
  
}
