package ders14_medhodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    // main medhod icerisinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip,
    // carpimlerini bize donduren bir method olusturun

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi girin");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println(carpimMethod(sayi1, sayi2));

        double carpimSonuc = carpimMethod(sayi1,sayi2);

    }

    public static double carpimMethod(double s1, double s2){
        System.out.println("carpim method'u calisti");
        return s1*s2;

    }

}
