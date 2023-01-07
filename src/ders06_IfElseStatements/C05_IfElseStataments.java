package ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStataments {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin, 65 yas ve üzeri ise "Emekli olabilirsiniz" yazdirin
        // yoksa emekli olmasi icin calismasi gereken yıl sayisini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz: ");

        int yas = scan.nextInt();

        if (yas >= 65){
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olmak için "+ (65-yas)+ " sene daha çalışmalısınız");

        }
    }
}
