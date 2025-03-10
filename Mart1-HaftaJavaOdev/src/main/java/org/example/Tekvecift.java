package org.example;


import java.util.Scanner;

public class Tekvecift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();


        if (sayi % 2 == 0) {
            System.out.println(sayi + " çift bir sayıdır.");
        } else {
            System.out.println(sayi + " tek bir sayıdır.");
        }


        scanner.close();
    }
}