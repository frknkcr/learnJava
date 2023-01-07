package ders06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir tam sayi alin
        sayi negatif ise "Geçersiz sayı"
        tek basamaklı ise "rakam"
        iki basamakli ise "iki basamakli sayi"
        bunun dısındaki sayiler icin "buyuk sayi" yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz: ");

        int sayi = scan.nextInt();

        if (sayi<0) {
            System.out.println("Geçersiz sayı");
        } else if (sayi<10) {
            System.out.println("Rakam");
        } else if (sayi<100) {
            System.out.println("İki basamaklı sayı");
        } else {
            System.out.println("Büyük sayı");
        }
    }
}
