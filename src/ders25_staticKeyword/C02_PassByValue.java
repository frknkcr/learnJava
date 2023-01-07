package ders25_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        Java PassByValue kullanir
        Yannni method'lar arasinda gonderilen variable'larin
        kendileri degil, value'lari diger method'a yollanir.
         */

        int fiyat = 100;
        // fiyat uzerinden %10 indirim yapip, indirimli fiyati donduren bir method olusturun

        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap10(fiyat));

        System.out.println(fiyat);

        // eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istersek
        // atama yapariz

    }

    public static int indirimYap10 (int fiyat){

        fiyat = fiyat * 90/100;

        return fiyat;
    }
}
