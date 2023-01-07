package ders25_staticKeyword;

import java.util.Locale;

public class C03_PassByValue {
    public static void main(String[] args) {

        int s = 20;

        // int s= 30;
        // bir scope'da tanimlanan variable'in yeniden tanimlanma imkani yoktur

        // String s= "Hasan";
        // data turunun degistirerek yeniden tanimlamak da mumkun degildir
        // cunku kullanirken variable'in ismini yazdigimizda hangi sayi variable'ini kullanacagi mechul olur

        System.out.println(s);

        method1();

    }

    public static void method1(){
        method2(5);
        String s = "Hasan";
        System.out.println(s.toLowerCase(Locale.ROOT)); // hasan

    }

    public static void method2(int s){
        s = s*s;
        System.out.println(s);

    }

}
