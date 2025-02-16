package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Başlangıç PIN kodu ve bakiye
        final int PIN = 1234;
        double balance = 1000.0;
        int userPin;
        boolean isAuthenticated = false;

        // PIN doğrulama
        System.out.println("ATM'ye Hoş Geldiniz");
        System.out.print("Lütfen PIN kodunuzu giriniz: ");

        while (!isAuthenticated) {
            userPin = scanner.nextInt();
            if (userPin == PIN) {
                isAuthenticated = true;
                System.out.println("Başarıyla giriş yaptınız!");
            } else {
                System.out.print("Hatalı PIN! Lütfen tekrar deneyiniz: ");
            }
        }

        // Menü ve işlemler
        int choice;
        do {
            System.out.println("\n--- Menü ---");
            System.out.println("1. Bakiye Görüntüleme");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Çıkış");
            System.out.print("Bir işlem seçiniz: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Bakiye Görüntüleme
                    System.out.printf("Hesap Bakiyeniz: %.2f TL\n", balance);
                    break;

                case 2: // Para Yatırma
                    System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("%.2f TL hesabınıza yatırıldı. Güncel bakiyeniz: %.2f TL\n", depositAmount, balance);
                    } else {
                        System.out.println("Geçersiz tutar! Lütfen pozitif bir değer giriniz.");
                    }
                    break;

                case 3: // Para Çekme
                    System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("%.2f TL hesabınızdan çekildi. Güncel bakiyeniz: %.2f TL\n", withdrawAmount, balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Yetersiz bakiye! Daha düşük bir tutar giriniz.");
                    } else {
                        System.out.println("Geçersiz tutar! Lütfen pozitif bir değer giriniz.");
                    }
                    break;

                case 4: // Çıkış
                    System.out.println("Çıkış yapılıyor. İyi günler dileriz!");
                    break;

                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyiniz.");
            }
        } while (choice != 4);

        scanner.close();
    }
}