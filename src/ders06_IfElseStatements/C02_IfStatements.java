package ders06_IfElseStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*
        kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar is "Eskenar ucgen" yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin 3 kenarının uzunlugunu giriniz: ");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();


        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Eşkenar üçgen");
        } else {
            System.out.println("Eşkenar üçgen degil");
        }


    }
}
