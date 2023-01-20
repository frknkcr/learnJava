package ders39_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {
    public static void main(String[] args) {

        // Kullanicidan bolunecek sayi ve bolecek sayiyi alip
        // bolme isleminin sonucunu carpma islemi ile bulan ve yazdiran bir method olusturun
        // islem kullanici q ya basincaya kadar devam etsin


        Scanner scan = new Scanner(System.in);
        boolean devamedelimMi = true;
        int sayi;
        int bolen;
        do {

            System.out.println("Bolunecek tam sayiyi girin\nBitirmek icin Q'ya basın ");
            try {
                sayi = scan.nextInt();
                System.out.println("Bölen sayiyi girin");
                bolen = scan.nextInt();
                carpmaIleBolme(sayi,bolen);
            } catch (InputMismatchException e) {
                String giris = scan.nextLine();

                if (giris.equalsIgnoreCase("q")){
                    devamedelimMi= false;
                }else {
                    System.out.println("Hatali giris");
                }
            }

        }while (devamedelimMi);

    }
    public static void carpmaIleBolme (int sayi, int bolen){
        double sonuc=1;

        int sonucIsareti = 1;

        if (sayi*bolen<0){
            sonucIsareti = -1;
        }

        sayi = sayi>=0 ? sayi : sayi*(-1);
        bolen = bolen>=0 ? bolen : bolen*(-1);

        while (sonuc*bolen<sayi){
            sonuc++;
        }
        if (sonuc*bolen == sayi) {
            System.out.println(sonuc * sonucIsareti);
        }else {
            System.out.println();
        }
    }
}
