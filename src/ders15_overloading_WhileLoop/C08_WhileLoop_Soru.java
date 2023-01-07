package ders15_overloading_WhileLoop;

public class C08_WhileLoop_Soru {
    public static void main(String[] args) {

        /*
        Soru 2- While loop kullanarak
        kullanicidan alinan sayinin rakamlar toplamini bulun.
         */

        int sayi = 1453878998;

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        while(sayi!=0){

            birlerBasamagi = sayi%10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }

        System.out.println(rakamlarToplami);

    }
}
