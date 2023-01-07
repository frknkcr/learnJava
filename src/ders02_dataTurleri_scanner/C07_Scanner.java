package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // soru 3 Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //   isminiz: John
        //   Soyisminiz: Doe
        //   Yasiniz: 44
        //   Kaydiniz basariyla tamamlanmistir


        Scanner scan = new Scanner(System.in);

        System.out.println("İsminiz ? : ");

        String isim = scan.nextLine();
        /*
        String icin kullanilabilen next() sadece ilk space'e kadar olan kismi alir
                                   nextline() ise o satirda yazilan tüm bilgiyi alir
         */

        System.out.println("Soyisminiz ? : ");

        String soyisim = scan.nextLine();

        System.out.println("Yasiniz ? : ");

        int yas = scan.nextInt();

        System.out.println("İsminiz : " + isim + "\nSoyisminiz : " + soyisim + "\nYasiniz : " + yas +
                "\nKaydiniz basariyla olusturuldu");


    }
}
