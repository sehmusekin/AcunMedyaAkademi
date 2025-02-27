package org.example;
import java.util.*;


public class Main {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        /*int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Lütfen 10 adet tam sayı giriniz:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / 10;
        System.out.println("Dizinin Ortalaması: " + average);

        System.out.println("50'den büyük olan elemanlar:");
        ArrayList<Integer> greaterThan50 = new ArrayList<>();
        for (int num : numbers) {
            if (num > 50) {
                greaterThan50.add(num);
            }
        }

        if (greaterThan50.isEmpty()) {
            System.out.println("Dizide 50'den büyük eleman yok.");
        } else {
            for (int num : greaterThan50) {
                System.out.print(num + " ");
            }
        }
        scanner.close();*/
       /*
        System.out.print("Kaç elemanlı bir dizi girmek istiyorsunuz? ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println(n + " adet sayı giriniz:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("Tekrar eden sayı bulunmamaktadır.");
        } else {
            System.out.println("Tekrar eden sayılar: " + duplicates);
        }
        scanner.close();*/


        /*
                System.out.print("Kaç elemanlı bir dizi girmek istiyorsunuz? ");
                int n = scanner.nextInt();
                int[] numbers = new int[n];

                System.out.println(n + " adet sayı giriniz:");
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextInt();
                }

                int positiveSum = 0;
                int negativeSum = 0;

                for (int num : numbers) {
                    if (num > 0) {
                        positiveSum += num;
                    } else if (num < 0) {
                        negativeSum += num;
                    }
                }

                System.out.println("Pozitif sayıların toplamı: " + positiveSum);
                System.out.println("Negatif sayıların toplamı: " + negativeSum);
                scanner.close();*/
       /*System.out.println("10 adet sayı giriniz:");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }
        numbers.sort(Collections.reverseOrder());
        System.out.println("Büyükten küçüğe sıralı: " + numbers);*/

        /*System.out.println("10 adet kelime giriniz:");
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            words.add(scanner.next());
        }
        Collections.sort(words);
        System.out.println("Alfabetik sıralı kelimeler: " + words);*/

        /* ArrayList<Integer> randomNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int num = rand.nextInt(100);
            randomNumbers.add(num);
            if (num % 2 == 0) evenNumbers.add(num);
        }
        System.out.println("Rastgele sayılar: " + randomNumbers);
        System.out.println("Çift sayılar: " + evenNumbers);*/

        /*ArrayList<String> cities = new ArrayList<>(Arrays.asList("İstanbul", "Ankara", "İzmir", "Bursa", "Antalya"));
        System.out.print("Bir şehir adı giriniz: ");
        String city = scanner.next();
        if (cities.contains(city)) {
            System.out.println(city + " listede var. İndeksi: " + cities.indexOf(city));
        } else {
            System.out.println(city + " listede yok.");*/
        /*ArrayList<Integer> numList = new ArrayList<>();
        System.out.println("10 adet sayı giriniz:");
        for (int i = 0; i < 10; i++) {
            numList.add(scanner.nextInt());
        }
        int max = Collections.max(numList);
        int min = Collections.min(numList);
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        scanner.close();*/


        /*ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");*/


       //get() = Belirtilen indeksteki öğeyi döndürür.
        //System.out.println(list.get(1));


        // set() = Belirtilen indeksteki öğeyi değiştirmek için kullanılır.
        // list.set(1, "JavaScript");
        //        System.out.println(list);

        //remove() =  Belirtilen indeksteki öğeyi veya öğeyi listeye göre siler
        // list.remove(0);
        //        System.out.println(list);

        // clear() = Tüm öğeleri listeden temizler
        // list.clear();
        // System.out.println(list);

        // size() = Listeye eklenen öğe sayısını döndürür.
        //System.out.println(list.size());

        //Arrays.sort() =  Diziyi sıralar.
        /* int[] numbers = {5, 2, 8, 1, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); */

        //Arrays.binarySearch() = Sıralı bir dizide, belirtilen öğenin indeksini arar.
        /*  int[] numbers = {1, 2, 3, 5, 8};
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println(index);*/

        // Arrays.copyOfRange() =  Dizinin belirli bir aralığını kopyalar.

        /*int[] numbers = {1, 2, 3, 4, 5};
        int[] subArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println(Arrays.toString(subArray));*/

        //Arrays.equals() = İki diziyi karşılaştırır.
        /*  int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {1, 2, 3};

        boolean isEqual = Arrays.equals(numbers1, numbers2);
        System.out.println(isEqual);*/

        //Arrays.fill() = Dizinin tüm öğelerini belirli bir değere atar.
        /*int[] numbers = new int[5];
        Arrays.fill(numbers, 10);
        System.out.println(Arrays.toString(numbers)); */


        /**/

    }
}