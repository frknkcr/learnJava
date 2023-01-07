package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {

        /*
        kullanicidan cinsiyetini ve yasini alin, kadın, 60 yas ve uzeri,
        erkek 65 yas ve uzeri emekli olabilir
        cinsiyet ve yası dikkate alarak
        "Emekli olabilirsin" veya "emekli olmak için ... yil calısman gerekir" yazdırın
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen cinsiyet seçimi yapınız (e,E/k,K): ");

        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz: ");

        double yas = scan.nextDouble();


        if (cinsiyet=='k' || cinsiyet=='K'){
            // giris yapilan deger bir kadina ait demektir
            if (yas<15){
                System.out.println("Hatali yas girisi");
            } else if (yas<60) {
                System.out.println("Emekli olamazsin, daha " +(60-yas) +" yil calismalisin");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet=='e' || cinsiyet=='E') {
            // giris yapilan deger bir erkege ait
            if (yas<15){
                System.out.println("Hatali yas girisi");
            } else if (yas<65) {
                System.out.println("Emekli olamazsin, daha " +(65-yas) +" yil calismalisin");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        }else{
            System.out.println("Yanlis cinsiyet girisi");
        }


    }
}
