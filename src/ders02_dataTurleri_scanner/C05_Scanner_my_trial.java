package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner_my_trial {

    public static void main(String[] args) {

        // Soru2- kullanicidan bir double bir de int sayi alip
        // bunlarin toplamini ve çarpımini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir ondalik sayi girin :");

        double sayi1 = scan.nextDouble();

        System.out.println("Lütfen bir tam sayi girin :");

        int sayi2 = scan.nextInt();

        double toplam = sayi1 + sayi2 ;

        System.out.println("Yazdiginiz sayilarin toplami :" + toplam);

        double carpim = sayi1 * sayi2 ;

        System.out.println("Yazdiginiz sayilerin carpimi :" + carpim);


    }
}
