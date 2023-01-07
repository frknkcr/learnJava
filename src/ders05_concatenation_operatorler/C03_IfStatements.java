package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // kullanicidan iki sayi alin
        // eger birinci sayi 100 den buyukse, "ilk sayi yuzden buyuk" yazdirin
        // eger ikinci sayi ciftse, "ikinci sayi cift" yazdirin
        // eger ilk sayi ikinci sayidan buyukse, "ilk sayi daha buyuk" yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("İki tam sayi giriniz: ");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1>100) {
            System.out.println("İlk sayı 100'den büyük"); }

        if (sayi2%2==0) {
            System.out.println("İkinci sayi çift");
        }

        if (sayi1>sayi2) {
            System.out.println("İlk sayi daha buyuk");
            } else if (sayi2>sayi1) {
            System.out.println("İkinci sayı daha büyük");

        }

    }
}
