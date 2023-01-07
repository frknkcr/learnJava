package ders08_ternary_switch;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        String sonuc = kenar1 == kenar2 && kenar3 == kenar1 ? "eşkenar üçgen" : "eşkenar degil";

        System.out.println(sonuc);

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan2 = new Scanner(System.in);

        System.out.println("İki sayi girin");

        double sayi1 = scan2.nextDouble();
        double sayi2 = scan2.nextDouble();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
    }
}
