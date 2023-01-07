package ders09_StringManipulations;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        /*
        equalsIgnoreCase ayni metnin buyuk kucuk harf kullanilarak olusturulan
        farkli yazimlari birbirine esit olarak kabul eder

        yani equalsIgnoreCase icin ali, ALI, Ali, ALİ, aLI birbirine esittir

        ama kelimede farklilik varsa bunları tölare etmez

        a li ile ali birbirine esit degildir
        ali ile ali. birbirine esit degildir
         */

    }
}
