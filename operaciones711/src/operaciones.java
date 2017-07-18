/**
 * Created by ROSSV on 12/07/2017.
 */
public class operaciones {

    public static void main(String[] args) {
        int[] cuentas=new int[10];

       //asigna ceros al arreglo, comprobacion de que hay ceros

        for (int indice = 0; indice < cuentas.length; indice++) {
            System.out.println(cuentas[indice]);
          }

        int bono[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int index=0;index<bono.length;index++){
            System.out.println("elementos del arreglo:"+bono[index]);
         int suma=bono[index]+1;
            System.out.println("elementos sumados:"+suma);
        }
        int mejoresPuntuaciones[]={9,8,10,7,9,10,8,6};
       /* System.out.println(mejoresPuntuaciones[0]);
        System.out.println(mejoresPuntuaciones[1]);
        System.out.println(mejoresPuntuaciones[2]);
        System.out.println(mejoresPuntuaciones[3]);
        System.out.println(mejoresPuntuaciones[4]);
*/     for(int imp=0;imp<5;imp++){
            System.out.println("los 5 primeros numeros: "+mejoresPuntuaciones[imp]);
        }

    }


    }


