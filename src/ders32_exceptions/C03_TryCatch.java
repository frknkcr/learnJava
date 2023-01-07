package ders32_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    public static void main(String[] args) {

        // kullanicidan toplamak uzere sayilar alin
        // kullanicinin islemi bitirmesi icin Q'ya basmasini isteyin
        // kullanici Q'ya bastiginda toplam kac sayi girdigini
        // ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        int girilenSayi = 0;
        int sayiAdedi = 0;
        int sayilarToplami = 0;
        while (true) {
            try {


                System.out.println("Toplamak icin tam sayi girin : " + "\n bitirmek icin Q'ya basin");
                girilenSayi = scan.nextInt();
                sayilarToplami += girilenSayi;
                sayiAdedi++;

            } catch (InputMismatchException e) {

                String girilenDeger = scan.nextLine();

                if (girilenDeger.equalsIgnoreCase("q")) {
                    System.out.println("Girilen " + sayiAdedi + " sayinin toplami : " + sayilarToplami);
                    break;

                } else {
                    System.out.println("Gecersiz input");
                }

            }
        }
    }
}
