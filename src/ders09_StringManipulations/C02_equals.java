package ders09_StringManipulations;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";

        String str3 = new String("Ali");
        String str4 = "Ali";

        System.out.println(str1 == str2);

        System.out.println(str1 == str3);

        System.out.println(str1 == str4);

        /*
        == String'leri karsilastirirken bekledigimiz sonuclari vermeyebilir
        String'lerde metinlerin ayni olup olmadigini karsilastirmak icin
        == yerine equals() kullanilir.
         */

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));


    }
}
