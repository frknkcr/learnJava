package ders06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatement {
    public static void main(String[] args) {

        // kullanıcıdan bir karakter girmesini isteyin
        // girilen karakterin buyuk harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir karakter giriniz: ");

        char krk = scan.next().charAt(0);

        if (krk >= 'A' && krk <= 'Z' ){
            System.out.println("Büyük harf");
        } else {
            System.out.println("Büyük harf değil");

        }

    }
}
