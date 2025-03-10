package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("ilk değeri giriniz:");
        int sayi1 = scanner.nextInt();

        System.out.print("ikinci değeri giriniz:");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1 + sayi2;

        System.out.println("Toplam = " + toplam);



        scanner.close();


    }
}