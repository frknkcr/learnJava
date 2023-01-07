package ders14_medhodOlusturma;

public class C02_StringConcate {

    // verilen iki string'i parametre olrak kabul edip
    // bu iki string'i aralarında  bir boşluk olan tek bir string olarak
    // main medhod'a donduren bir medhod olusturun

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzeldir";

        System.out.println(tekStr(str1, str2));

    }

    public static String tekStr(String s1, String s2){
        return s1+" "+s2;
    }

}
