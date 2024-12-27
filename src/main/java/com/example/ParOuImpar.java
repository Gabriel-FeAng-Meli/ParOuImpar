package com.example;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        
        double number;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\n============================================================\n");;

        System.out.println("Escolha um número:");

        number = inputScanner.nextDouble();

        inputScanner.close();

        double moduleByTwo = number % 2;

        if (moduleByTwo != 0) {
            System.out.println("O número escolhido é impar");
        } else {
            System.out.println("O número escolhido é par");
        }

        System.out.println("\n============================================================\n");

    }
}