package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();


        System.out.println( ad );


        scanner.close();
    }
}
