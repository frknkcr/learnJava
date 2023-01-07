package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {

    public static void main(String[] args) {

        /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        (kilo*10000 / (boy *boy))
        vucut kitle endeksi 30’dan buyukse obez,
        25-30 arasi ise kilolu, 20-25 arasi ise normal,
        20’den kucukse zayif yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu giriniz(kg): ");

        double kilo = scan.nextDouble();

        System.out.println("Lütefen boyunuzu giriniz(cm): ");

        double boy = scan.nextDouble();
        double kitleEndeks = (kilo*10000 / (boy *boy));

        System.out.println("Vücut kitle endeksiniz: "+kitleEndeks);

        if (kilo<=0 && boy<=0) {
            System.out.println("Geçersiz giriş!");
        } else if (kitleEndeks>30) {
            System.out.println("Obez");
        } else if (kitleEndeks>= 25) {
            System.out.println("Kilolu");
        } else if (kitleEndeks>= 20 ) {
            System.out.println("Normal");
        } else if (kitleEndeks>0) {
            System.out.println("Zayıf");
        } else {
            System.out.println("Hesaplama yapılamadı!");
        }

    }
}
