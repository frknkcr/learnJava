package ders09_StringManipulations;

public class C05_Length {
    public static void main(String[] args) {

        String str = "uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length());

        // son karakteri yazdirin

        System.out.println(str.charAt(str.length()-1)); //son karakteri elde etmek icin kullanilir

        // sondan 3. karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));

    }
}
