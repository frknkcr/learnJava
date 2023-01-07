package ders08_ternary_switch;

public class C03_Ternary {
    public static void main(String[] args) {


        int a = 5;
    /*
    Ternary operatoru tek basına kullanilamaz
    ternery bize bir sonuc uretir
    bu sonucu ya direk yazdirmali veya bir variable'a atamaliyiz
     */
        String sonuc = a % 2 == 0 ? "çift sayı" : "tek sayı";
        System.out.println(sonuc);

    /*
    Ternary'nin sonucunu bir veriable'a atayacaksak
    true ve false durumlarinda uretilecek sonucun
    ayni data turune uygun olmasi gerekir
    aksi halde CTE olusur

    ama ternary'i sout icinde kullanirsak
    sonucların data turunun ayni olmasi sart olmaz
     */

        String sonuc2 = a > 10 ? "buyuk sayi" : "" + 2 * a;
        //CTE vermemesi icin string'e cevirdik

        System.out.println(a > 10 ? "buyuk sayi" : "" + 2 * a);

    }
}
