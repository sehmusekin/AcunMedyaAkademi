package org.example;
import java.util.*;

public class Diziolusturma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];


        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println("Girilen dizi elemanları:");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }

}