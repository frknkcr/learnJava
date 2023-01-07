package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replace(' ','-'));

        System.out.println(str.replace("candir","cok guzeldir"));

        System.out.println(str.replace(" ",""));

        // String'deki tum a'lari silin

        System.out.println(str.replace("a",""));

        // Java yerine hava, candir yerine cok guzel yazdiralim

        System.out.println(str.replace("Java","Hava")
                .replace("candir","cok guzel")); // birden fazla replace arka arkaya yazılabilir

        System.out.println(str.replace("","-"));

        // sadece 1. a'yi A yazin

        System.out.println(str.replaceFirst("a","A"));


    }
}
