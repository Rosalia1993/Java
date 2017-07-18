package com.company;

public class Main {
public static int producto(int... arreglo){
    int total=1;
    for(int d:arreglo)
        total*=d;
    return total;


}
    public static void main(String[] args) {

    int numero1=3;
    int numero2=2;
    int numero3=2;
        System.out.println("el producto es:"+producto(numero1,numero2,numero3));
    }

}
