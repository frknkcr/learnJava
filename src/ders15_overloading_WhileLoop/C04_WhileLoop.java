package ders15_overloading_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan toplanmak uzere tamsayilar alin
        kullanici 0'a basarsa sayi alma islemini bitirin

        kullanicinin kac sayi girdigini
        ve bu sayilarin toplamini yazdirin
         */

        Scanner scan = new Scanner(System.in);

        int girilenSayi=1;

        int sayac = 0;
        int toplam = 0;

        while(girilenSayi!=0){
            System.out.println("toplamak istediginiz tam sayilari girin: "+
                    "\nBitirmek icin 0'a basin");
            girilenSayi= scan.nextInt();

            if (girilenSayi !=0){
                sayac++;
                toplam=toplam+girilenSayi;
            }
        }

        System.out.println("Girilen "+sayac+" adet sayının toplamı: "+toplam);


    }
}
