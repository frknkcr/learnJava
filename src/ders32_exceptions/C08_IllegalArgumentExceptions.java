package ders32_exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentExceptions {

    public static void main(String[] args) {

        // Kullanicidan yasini girmesini isteyin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi girin");

        int yas = scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException("Hata");
            }else {
                System.out.println("Yasiniz kaydedildi");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
