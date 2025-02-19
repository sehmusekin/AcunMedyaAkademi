package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Lütfen hızınızı giriniz (km/s): ");
        int hiz = scanner.nextInt();

        // If-Else ile ceza hesaplama
        if (hiz <= 90) {
            System.out.println("Hızınız sınırların içinde, iyi yolculuklar!");
        } else if (hiz > 90 && hiz <= 110) {
            System.out.println("Hız sınırını 90-110 km/s aştınız. Ceza: 1000 TL");
        } else if (hiz > 110 && hiz <= 130) {
            System.out.println("Hız sınırını 110-130 km/s aştınız. Ceza: 2000 TL");
        } else {
            System.out.println("Hız sınırını 130 km/s aştınız. Ehliyetinize el konuldu!");
        }

        // Switch-Case ile durum mesajı
        System.out.print("\nEk bilgi için hızınızı tekrar giriniz (km/s): ");
        hiz = scanner.nextInt();

        switch (hiz / 10) {
            case 9:
                System.out.println("Hızınız sınırda, dikkatli olunuz.");
                break;
            case 10:
            case 11:
                System.out.println("Hız sınırını aştınız, lütfen daha dikkatli olunuz.");
                break;
            case 12:
            case 13:
                System.out.println("Hızınız tehlikeli seviyede, ciddi cezalar alabilirsiniz.");
                break;
            default:
                if (hiz > 130) {
                    System.out.println("Ehliyetinize el konuldu!");
                } else {
                    System.out.println("Hızınız sınırın altında, iyi yolculuklar!");
                }
                break;
        }

        scanner.close();
    }
}