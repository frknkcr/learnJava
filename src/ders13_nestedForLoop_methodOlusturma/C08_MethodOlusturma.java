package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {

        /*
        kullanicidan iki sayi alip bunlarin toplamini yazdiran bir method olusturun
         */

        isteToplaYazdir();
        isteToplaYazdir();

    }
    public static void isteToplaYazdir(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        Double sayi1 = scan.nextDouble();
        Double sayi2 = scan.nextDouble();

        System.out.println("Girilen sayilarin tplami : "+ (sayi1+sayi2));

    }
}
