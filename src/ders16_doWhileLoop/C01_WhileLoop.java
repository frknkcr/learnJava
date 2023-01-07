package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // 10-11-12 sayılarını toplayan bir while loop olusturalim

        int sayi = 10;
        int toplam= 0;

        while (sayi<=12){
            toplam += sayi;
            sayi++;
        }

        /*
        while loop da iki problem olusabilir
        1- once degeri kontrol edip sonra islem yaptigimizdan
        body'de bir kere daha kontrol etmemiz gerekebilir
        2- yapilan islem sayisindan 1 fazla while bitis sarti kontrol edilir
        3- while loop öncesinde degerleri kontrol edecegimiz bir veriable olusturuyorsak
        ona yapacagımız atamayi dikkatli yapmamiz gerekir
        bazen yanlis deger atamasi yapmak while loop'un calismamasına neden olabilir
         */

        System.out.println(toplam);

    }
}
