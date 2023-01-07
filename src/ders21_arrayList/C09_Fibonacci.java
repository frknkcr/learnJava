package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan pozitif bir tamsayi alip,
        //         o tamsayidan kucuk Fibonacci sayilarini bir liste olarak
        //          yazdirin
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 .....

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi girin: ");
        int girilenSayi = scan.nextInt();

        if (girilenSayi<0){
            System.out.println("Fibonacci serisi icin 0'dan buyuk tamsayi girmelisin!");
        } else if (girilenSayi==0) {
            System.out.println("0'dan kucuk fibonacci sayisi yoktur"); 
        } else if (girilenSayi == 1) {
            System.out.println("1'den kucuk tek fibonacci sayisi vardır : 0");
        }else {
            System.out.println(fibonacciSayilariniYazdir(girilenSayi));
        }
    }
    public static List<Integer> fibonacciSayilariniYazdir (int sayi){
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        fibonacci.add(1);

        int yeniFibonacciSayisi = 0;
        int index = 3;

        while (yeniFibonacciSayisi<sayi){

            yeniFibonacciSayisi = fibonacci.get(index-2) + fibonacci.get(index-1);

            if (yeniFibonacciSayisi<sayi){

                fibonacci.add(yeniFibonacciSayisi);
            }
            index++;
        }
      return fibonacci;
    }
}
