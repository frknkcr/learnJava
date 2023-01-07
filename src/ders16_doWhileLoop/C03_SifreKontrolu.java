package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_SifreKontrolu {
    public static void main(String[] args) {

    /*
    Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
    sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
    - Sifre kucuk harf icermelidir
    - Sifre buyuk harf icermelidir
    - Sifre ozel karakter icermelidir
    - Sifre en az 8 karakter olmalidir.
     */

        Scanner scan = new Scanner(System.in);

        String sifre;
        int flag;
        Boolean sifreDogruMu;

        do {
            System.out.println("Lütfen bir sifre giriniz : ");
            sifre = scan.nextLine();
            flag = 0;
            
            int sonuc = kucukHarfKontroluYap(sifre);
            flag += sonuc;

            sonuc = buyukHarfKontroluYap(sifre);

            flag += sonuc;

            sonuc = ozelKarakterKontroluYap(sifre);

            flag += sonuc;

            if (sifre.length()<8){
                System.out.println("Sifre en az 8 karakter olmalidir");
            }else {
                flag++;
            }

        }while (flag != 4);

        System.out.println("Sifreniz basari ile kaydedildi");

    }

    private static int ozelKarakterKontroluYap(String sifre) {
        int flag = 0;
        String ozelKarakterler = "§±@!$%^&*()_-+=?/>.<,`~#";

        for (int i = 0; i < sifre.length(); i++) {
            if (ozelKarakterler.contains(sifre.substring(i,i+1))){
                flag++;
                break;
            }
            
        }
        if (flag==0){
            System.out.println("Sifre ozel karakter icermeli");
            return 0;
        }else return 1;
    }

    private static int buyukHarfKontroluYap(String sifre) {
        int flag = 0;

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Sifre buyuk harf icermelidir");
            return 0;
        }else return 1;
    }

    private static int kucukHarfKontroluYap(String sifre) {
        int flag = 0;

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Sifre kucuk harf icermelidir");
            return 0;
        }else return 1;
    }
}
