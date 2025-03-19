package org.example;

import java.util.Scanner;

public class sayılarınToplamı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        long sayi = scanner.nextInt();
        long toplam = 0;

        for (long i = 1; i <= sayi; i++) {
            toplam += i;
        }

        System.out.println("1'den " + sayi + "'e kadar olan sayıların toplamı: " + toplam);
        // kulanıcının  int değerinden daha buyuk sayı gırdığınde hata vermemesı için long kulandım
    }
}
