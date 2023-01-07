package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu
        // ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.

        System.out.println("Olusturdugunuz array: "+Arrays.toString(arrayOlustur()));

    }
    public static int[] arrayOlustur(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç eleman içerecek bir liste olusturmak istersiniz ? ");
        int arrayLength = scan.nextInt();
            int kullaniciArray [] = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Listede yer alacak rakam: ");
            kullaniciArray[i] = scan.nextInt();
        }
        return kullaniciArray;
    }
}
