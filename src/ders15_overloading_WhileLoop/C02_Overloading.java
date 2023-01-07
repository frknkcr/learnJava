package ders15_overloading_WhileLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        carpim(3,4);
        carpim(3.4,2);

    }
    //Bir class'da ayni isim ve ayni signature'a sahip iki method olmaz
    public static void carpim(int sayi1, int sayi2){
        System.out.println("iki integer sayinin carpimi: "+sayi1*sayi2);
    }

    public static void carpim(int sayi1, int sayi2, int sayi3) {
        System.out.println("uc integer sayinin carpimi: " + sayi1 * sayi2 * sayi3);
    }

    public static void carpim(int sayi1, double sayi2) {
        System.out.println("iki integer-double sayinin carpimi: " + sayi1 * sayi2);
    }

    public static void carpim(double sayi1, int sayi2) {
        System.out.println("iki double-integer sayinin carpimi: " + sayi1 * sayi2);
    }
}
