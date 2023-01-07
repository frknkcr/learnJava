package ders32_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        /*
            Try-catch bloklarinin amaci
            riski 0 yapmak degil
            kodu iyi analiz yapip
            java'nin cozemeyecegi durumlarda ne yapmasini istedigimizi kendisine soylemektir.

            Java tryblogunda basedemeyecegi bir sorunla karsilasirsa
            siz o sorunu declare edinceye kadar
            yani catch() satirina kadar
            calismayi durdurur.

            Bu durumda sorun olan satir ile catch satiri arasindaki kodlar calismaz.
         */

        /*
            kullanicidan iki tam sayi alip
            sayilari birbirine bolup, sonucu yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Birbirine bolmek istediginiz2 tam sayi girin");

        int sayi1 =scan.nextInt();
        int sayi2 =scan.nextInt();


        try {
            System.out.println("Iki sayinin bolumu : "+sayi1/sayi2);

            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");

        } catch (ArithmeticException e) {
            System.out.println("bolen sayi 0 olamaz");
            e.printStackTrace();

        }

    }
}
