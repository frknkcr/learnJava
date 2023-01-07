package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan iki sayi alip ikisinin degerlerini degistirin(swap)

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen birinci sayiyi girin : ");

        int sayi1 = scan.nextInt();

        System.out.println("Lütfen ikinci sayiyi girin : ");

        int sayi2 = scan.nextInt();

        // sayi1 = sayi2 ^ sayi1 ^ (sayi2 = sayi1); Alternative çözüm

        int bos;

        bos = sayi2;

        sayi2 = sayi1;

        sayi1 = bos;

        System.out.println("Birinci sayi : " + sayi1 + "\nİkinci sayi : " +sayi2);


    }
}
