package ders19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alip bir array olusturun
        // kullanici eleman girisini bitirmek icin 0'a bassin

        int sayi = 0;
        int[] arr = {0};

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Array'e eklemek icin sayi girin: " +
                    "\nBitirmek icin '0' a basın");
            sayi = scan.nextInt();
            if (arr[0]==0){
                arr[0] = sayi;
            }else if (sayi!=0) {
                arr = C08_ArrayeElemanEklemeMethodu.arrayeElemanEkle(arr, sayi);
            }

        }while(sayi!=0);

        System.out.println(Arrays.toString(arr));
    }
}
