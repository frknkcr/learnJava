package ders09_StringManipulations;

public class C04_charAT {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.charAt(0)); // ilk harfi verir J

        System.out.println(str.charAt(5)); // 5.index'deki char'i verir

        System.out.println(str.charAt(10)); // bana sonuncu karakteri yazdirin

        /*
        bir metindeki karakter sayisi ile son index arasinde 1 fark vardir
        bu metin icin karakter sayisi 11 son index 10 dur.
         */

        System.out.println(str.charAt(11)); //sinirlarin disinda hatası verir




    }
}
