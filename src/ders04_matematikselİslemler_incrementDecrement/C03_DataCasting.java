package ders04_matematikselİslemler_incrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        // kullanicidan iki int deger alip
        // bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("İki tam sayi girin : ");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        double bolumSonucu = (double)sayi1/sayi2; // double / int ==> geniş olan dogru sonuc verir


        System.out.println(bolumSonucu);


    }
}
