package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Değişkenlerin tanımlanması
        int[] notlar = new int[5];
        int toplam = 0;
        int enYuksek = Integer.MIN_VALUE;
        int enDusuk = Integer.MAX_VALUE;
        boolean dusukNotVar = false;

        // 5 dersin notlarını alma ve işleme
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". dersin notunu giriniz: ");
            notlar[i] = scanner.nextInt();

            // Not toplamını hesaplama
            toplam += notlar[i];

            // En yüksek ve en düşük notu bulma
            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
            if (notlar[i] < enDusuk) {
                enDusuk = notlar[i];
            }

            // 30'un altında not var mı kontrol etme
            if (notlar[i] < 30) {
                dusukNotVar = true;
            }
        }

        // Ortalamayı hesaplama
        double ortalama = toplam / 5.0;

        // Ortalamaya göre geçme durumu
        System.out.println("\nOrtalamanız: " + ortalama);
        if (ortalama > 50) {
            System.out.println("Tebrikler, geçtiniz!");
        } else {
            System.out.println("Maalesef, kaldınız.");
        }

        // 30'un altında not varsa uyarı mesajı
        if (dusukNotVar) {
            System.out.println("Düşük not aldığınız dersler var!");
        }

        // En yüksek ve en düşük notları ekrana yazdırma
        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("En düşük not: " + enDusuk);

        scanner.close();
    }
}