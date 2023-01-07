package ders10_stringManipulation;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        /*
        mail kontrolu yapan bir program hazirlayin
        1- mail @ isareti icermiyorsa "gecersiz email"
        2- @gmail.com icermiyorsa "gmail adresi giriniz"
        3- @gmail.com ile bitmiyorsa "yazim hatası"
        seklinde sonuc yazin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi girin");

        String mail = scan.next();

        if (!mail.contains("@")){
            System.out.println("Geçersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("gmail adresinizi giriniz");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("yazım hatası");
        } else{
            System.out.println("mail adresiniz basarıyla kaydedildi");
        }
    }
}
