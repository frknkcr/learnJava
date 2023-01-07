package ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin 3 kenarının uzunlugunu giriniz: ");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("Geçersiz kenar uzunluğu");
        } else if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Eşkenar üçgen");
        } else {
            System.out.println("Eşkenar üçgen değil");
        }

    }
}
