package ders40_genelTekrar;

import java.util.Scanner;

public class C001_RecursiveMethods {

    // Kullanicidan pozitif bir tam sayi alip
    // o sayidan 0'a kadar olan pozitif tam sayilari toplayin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi girin");
        int sayi = scan.nextInt();

        toplaForLoop(sayi);
        System.out.println(toplaRecursive(sayi));

    }

    private static int toplaRecursive(int sayi) {

        if (sayi>0) {
            return sayi + toplaRecursive(sayi - 1);
        }
        return sayi;
    }

    private static void toplaForLoop(int sayi) {

        int toplam=0;
        for (int i = 0; i <= sayi; i++) {
            toplam += i;
        }

        System.out.println("For loop ile toplam: "+toplam);
    }
}
