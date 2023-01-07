package ders10_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str = "manti acarken java ogrenilmez";

        System.out.println(str.startsWith("Manti"));

        System.out.println(str.startsWith("m"));

        System.out.println(str.startsWith("manti acarken java ogrenilmez"));

        System.out.println(str.startsWith(""));

        System.out.println(str.startsWith("acarken", 6));

        System.out.println(str.startsWith("manti",0));

        System.out.println(str.startsWith("java",10));


    }
}
