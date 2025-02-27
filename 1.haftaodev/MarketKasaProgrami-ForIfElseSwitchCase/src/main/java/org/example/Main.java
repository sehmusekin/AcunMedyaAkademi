import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ürünlerin fiyatları
        final double URUN1_FIYAT = 10.0; // Örnek: Ekmek
        final double URUN2_FIYAT = 20.0; // Örnek: Süt
        final double URUN3_FIYAT = 30.0; // Örnek: Peynir

        double toplamTutar = 0.0;
        int secim;

        System.out.println("Marketimize Hoş Geldiniz!\n");
        System.out.println("Ürün Listesi:");
        System.out.println("1. Ekmek (10 TL)");
        System.out.println("2. Süt (20 TL)");
        System.out.println("3. Peynir (30 TL)");
        System.out.println("0. Alışverişi Tamamla\n");

        // Ürün seçimi döngüsü
        do {
            System.out.print("Bir ürün seçiniz (0 ile çıkış yapabilirsiniz): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplamTutar += URUN1_FIYAT;
                    System.out.printf("Ekmek sepete eklendi. Güncel toplam: %.2f TL\n", toplamTutar);
                    break;
                case 2:
                    toplamTutar += URUN2_FIYAT;
                    System.out.printf("Süt sepete eklendi. Güncel toplam: %.2f TL\n", toplamTutar);
                    break;
                case 3:
                    toplamTutar += URUN3_FIYAT;
                    System.out.printf("Peynir sepete eklendi. Güncel toplam: %.2f TL\n", toplamTutar);
                    break;
                case 0:
                    System.out.println("Alışveriş tamamlanıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyiniz.");
            }
        } while (secim != 0);

        // İndirim kuponu kontrolü
        System.out.print("Eğer indirim kuponunuz varsa 'EVET' yazınız, yoksa 'HAYIR': ");
        String kupon = scanner.next();

        if (kupon.equalsIgnoreCase("EVET")) {
            toplamTutar *= 0.9; // %10 indirim uygulanır
            System.out.println("%10 indirim uygulandı.");
        }

        // Toplam tutar yazdırılır
        System.out.printf("Toplam ödemeniz: %.2f TL\n", toplamTutar);

        System.out.println("Marketimizi tercih ettiğiniz için teşekkür ederiz! İyi günler!");

        scanner.close();
    }
}
