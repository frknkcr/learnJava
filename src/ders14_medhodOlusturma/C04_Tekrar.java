package ders14_medhodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        // bu iki sayinin carpim sonucunu yeni kod yazmadan konsola yazdirin

        System.out.println(C01_Carpim.carpimMethod(a, b));

        String c = "Nasil";
        String d = "yani";
        //bu iki String'i aralar,nda bir bosluk birakarak yazdirin
        System.out.println(C02_StringConcate.tekStr(c, d));

        String e ="Bu da mi oldu?";
        // e String'ini tersten yazdirin
        System.out.println(C03_StringTerseCevirme.StringiTerseCevir(e));


    }
}
