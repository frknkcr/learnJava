package ders03_datacastingWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi= 20;

        /*
        genis data turundeki bir degeri
        dar data tutundeki bir variable'a atamak isterseniz
        java sorumlulugu almanizi ister

        bu sorumlulugu almak icin
        cast edecegimiz deger'in onune () icerisinde
        cast etmek istedigimiz data turu yazilir

        ancak bu durumda data kayiplari (double'dan int'e gecerken virgulden sonrasi silinir)
        veya baskalasim olabilir (int'i byte çevirirsek tekrar tekrar basa doner)
         */

        short sh= (short) sayi;

        double dbl = 23.5;

        int say = (int)dbl;

        System.out.println(say); //23

        say = 256; // int

        byte byt = (byte)say;

        System.out.println(byt); //15



    }
}
