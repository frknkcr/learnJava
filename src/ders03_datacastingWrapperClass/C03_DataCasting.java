package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        // kullanıcıdan bir tam sayi alin
        // kullanici kac girerse girsin
        // konsolda -128 ile +127 arasında bir sonuc yazdiracak
        // kod yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz : ");

        int girilensayi = scan.nextInt();

        byte donusensayi = (byte) girilensayi;

        System.out.println("girilen sayinin donusen hali" + donusensayi);

    }
}
