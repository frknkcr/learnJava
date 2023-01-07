package ders15_overloading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop_Soru {
    public static void main(String[] args) {

        //Soru :Kullanicidan sifre
        //isteyin asagidaki sartlari saglamayan
        //sifrelerde hatalari yazdirip,
        //kullanicinin yeni sifre girmesi isteyin
        //Gecerli bir sifre yazilincaya kadar bu
        //islemi tekrar edin gecerli sifre
        //yazilinca “sifreniz basari ile kaydedildi” yazdirin
        //sartlar :
        //- sifrenin ilk karakteri kucuk harf olmali
        //- sifrenin son karakteri sayi olmali
        //- en az 8 karakter olmalı

        Scanner scan= new Scanner(System.in);

        Boolean sifreGecerliMi = false;
        String sifre = "";
        int flag;

        while(sifreGecerliMi!=true){
            System.out.println("Olusturmak istediginiz sifreyi giriniz: ");
            sifre = scan.nextLine();
            flag =0;

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("Ilk karakter kucuk harf olmali ! \n");
                flag++;
            }

            if (!(sifre.charAt(sifre.length()-1)>='0'&& sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("Son karakter sayi olmali !\n");
                flag++;
            }

            if (sifre.length()<8){
                System.out.println("En az 8 karakter olmali !\n");
                flag++;
            }

            if (flag>0){
                System.out.println("TEKRAR DENEYİN !\n");
            }

            if (flag==0){
                sifreGecerliMi=true;
                System.out.println("Sifre basari ile olusturuldu");
            }
        }
    }
}
