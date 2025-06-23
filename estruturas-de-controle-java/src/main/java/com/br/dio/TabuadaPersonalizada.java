package com.br.dio;

import java.util.Scanner;

public class TabuadaPersonalizada {
    //Escreva um código onde o usuário entra com um número
    // seja gerada a tabuada de 1 até 10 desse número;
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler o número do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt(); // Lê o número digitado

        System.out.println("\nTabuada do " + numero + ":");

        // Estrutura de repetição para gerar a tabuada de 1 a 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }

        scanner.close();
    }

}