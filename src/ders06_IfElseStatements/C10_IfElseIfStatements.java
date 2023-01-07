package ders06_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        kullanicidan cinsiyetini ve yasini alin, kadın, 60 yas ve uzeri,
        erkek 65 yas ve uzeri emekli olabilir
        cinsiyet ve yası dikkate alarak
        "Emekli olabilirsin" veya "emekli olmak için ... yil calısman gerekir" yazdırın
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi girin (E/K) ");

        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen yaşınızı girin");

        int yas = scan.nextInt();

        if (cinsiyet == 'E' && yas>65) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet == 'K' && yas>60) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet == 'E' && yas<65) {
            System.out.println("Emeklilik için " + (65-yas) + " yıl daha çalışmanız gerekiyor" );
        } else if (cinsiyet == 'K' && yas<60) {
            System.out.println("Emeklilik için " + (60-yas) + " yıl daha çalışmanız gerekiyor");
        }else {
            System.out.println("Hatalı deger girdiniz");
        }


    }
}
