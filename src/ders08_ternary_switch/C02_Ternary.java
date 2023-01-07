package ders08_ternary_switch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";

        /*
        verilen iki metin birbiri ile aynı ise metinler ayni
        farkli ise metinler farkli yazdirin
         */

        if (str1.equals(str2)){
            System.out.println("metinler aynı");
        }else {
            System.out.println("metinler farklı");
        }

        System.out.println(str1.equals(str2) ? "metinler aynı" : "metinler farklı");
    }
}
