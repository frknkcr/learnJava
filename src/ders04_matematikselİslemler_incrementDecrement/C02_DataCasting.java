package ders04_matematikselİslemler_incrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {

        // soru-4 Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum isleminin tamsayi kismini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen iki sayı girin: ");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        int bolmeSonucuTamsayi = (int)(sayi1/sayi2);

        System.out.println(bolmeSonucuTamsayi);
    }
}
