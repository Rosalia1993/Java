
package lineacomandos715;
import java.util.Scanner;
/**
 *
 * @author ROSSV 4/02/2018
 */
public class Lineacomandos715 {

    
    public static void main(String[] args) {
   
     
     Scanner entrada= new Scanner(System.in);
      System.out.println("deme el tamaño del arreglo");
       int tamaño=entrada.nextInt();
      
       System.out.println("deme el inicio del arreglo");
       int inicio=entrada.nextInt();
       
       System.out.println("deme el incrmento del arreglo");
       int incremento=entrada.nextInt();
    
       int []comandos;
       //pide entrada 0, como leo el enter?
       if(tamaño==0){
       comandos= new int[10];
       }
       else{
       comandos =new int[tamaño];
       } 
       comandos[0]=inicio;
     
       
 
        System.out.printf("%s%8s\n","indice","valor");
        
        for(int contador=0; contador<comandos.length;contador++){
        System.out.printf("%5d%8d\n",contador, comandos[contador]=
                inicio+incremento*contador);
        
        }
    
        
       }
   
    
    
}
