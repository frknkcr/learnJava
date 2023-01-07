package ders32_exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {

        /*
            kullanicidan iki tam sayi alip
            sayilari birbirine bolup, sonucu yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Birbirine bolmek istediginiz2 tam sayi girin");

        int sayi1 =scan.nextInt();
        int sayi2 =scan.nextInt();

        try {
            // try bolumu : yapmak istediginiz ama exc. riski olusan kodlar
            System.out.println("Iki sayinin bolumu : "+sayi1/sayi2);
        } catch (ArithmeticException e)
            // catch() : bekledigimiz muhtemel exception ve
            //           bu exc. gerceklesirse hata dokumani store edebilecegimiz veriable
        {
            System.out.println("Bolecek sayi 0 olamaz");
            e.printStackTrace();
            // catch blogu : exception gerceklesirse calismasini istedigimiz kodlar
            //               burayi yazarken oncelikle
            //               exp/olustugunda kodlarin calismasi dursun mu ? yoksa devm mi etsin
            //               karar vermeliyiz
        }
    }
}
