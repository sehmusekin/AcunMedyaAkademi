package org.example;

public class EnBuyukSayi {
    public static void main(String[] args) {
        int[] dizi = {12, 45, 78, 23, 89, 54, 99, 3};
        int enBuyuk = dizi[0];

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }

        System.out.println("Dizideki en büyük sayı: " + enBuyuk);
    }
}

