package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Soru 4 kullanicidan bir dikdörtgenin 2 kenar uzunlugunu alip,
        // dikdörtgenin alaninin yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Alan hesabi yapmak istediginiz dortgenin iki kenar uzunlugunu giriniz, \nkenar uzunlugu arasinda enter'a basın ");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("Dortgenin alani : " + (sayi1*sayi2) +" M2 " );
    }
}
