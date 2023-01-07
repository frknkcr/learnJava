package ders15_overloading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan toplanmak uzere sayi alin
        sayilarin toplami 500'e esit olursa

        girilen sayi adedi
        girilen sayilarin toplamini yazdirin
        "bu kadar yeter" yazdirin
         */

        Scanner scan = new Scanner(System.in);

        double girilenSayi = 0;

        double toplam = 0;

        int sayac = 0;

        while (toplam<500){

            System.out.println("Toplmak istediginiz sayilari girin");

            girilenSayi= scan.nextDouble();

            toplam+= girilenSayi;

        }

        System.out.println(toplam );
    }
}
