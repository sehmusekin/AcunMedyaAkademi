package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menü ve fiyatlar
        System.out.println("📋 RESTORAN MENÜSÜ:");
        System.out.println("1. Pizza - 100 TL");
        System.out.println("2. Hamburger - 80 TL");
        System.out.println("3. Salata - 50 TL");
        System.out.println("4. Çorba - 40 TL");
        System.out.println("5. Tatlı - 60 TL");
        System.out.println("0. Siparişi Tamamla");

        int toplamHesap = 0;
        int secim;

        // Sipariş döngüsü
        do {
            System.out.print("\nBir yemek seçiniz (0 ile siparişi tamamla): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Pizza seçtiniz - 100 TL");
                    toplamHesap += 100;
                    break;
                case 2:
                    System.out.println("Hamburger seçtiniz - 80 TL");
                    toplamHesap += 80;
                    break;
                case 3:
                    System.out.println("Salata seçtiniz - 50 TL");
                    toplamHesap += 50;
                    break;
                case 4:
                    System.out.println("Çorba seçtiniz - 40 TL");
                    toplamHesap += 40;
                    break;
                case 5:
                    System.out.println("Tatlı seçtiniz - 60 TL");
                    toplamHesap += 60;
                    break;
                case 0:
                    System.out.println("Sipariş tamamlanıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }
        } while (secim != 0); // Kullanıcı 0 girene kadar devam et

        // Toplam hesap gösterimi
        System.out.println("\nToplam Hesap: " + toplamHesap + " TL");
        System.out.println("Afiyet olsun!");
        scanner.close();
    }
}