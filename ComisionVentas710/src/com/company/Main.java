package com.company;

public class Main {

    public static void main(String[] args) {
        int ventas[] = {5000, 1000, 350, 500, 899};

        for (int indice=0;indice<=ventas.length;indice++) {

            double porcentaje = ventas[indice]*0.09;
            System.out.println(ventas[indice]);
            double total =porcentaje+200;
            System.out.println("el salario total es: "+total);
        }

    }

}
