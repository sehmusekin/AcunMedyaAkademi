package org.example;

import java.util.Scanner;

public class Pozitifnegatif {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi>0) {
            System.out.println(sayi + "  :Pozitif  bir sayıdır.");
        } else if (sayi <0) {
            System.out.println(sayi + "  :Negatif  bir sayıdır.");
        } else  {
            System.out.println(sayi + " : Sayı sıfırdır.");

        }

        scanner.close();


    }
}

