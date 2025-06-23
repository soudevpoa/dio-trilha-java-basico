package com.br.dio.WHILE;

public class TabuadaDe1a5 {

    //Gere a tabuada de 1 a 10 para todos os números de 1 a 5.
    public static void main(String[] args) {

        int numeros = 1;
        while (numeros <= 5) {
            System.out.println("\nTabuada do " + numeros + ":");
            int i = 1;
            while (i <=10){
                System.out.println(numeros + " x " + i + " = " + (numeros * i));
                i++;
            }
        numeros++;
        }
    }
}