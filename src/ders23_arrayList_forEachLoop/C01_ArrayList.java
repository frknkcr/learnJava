package ders23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayList {
    public static void main(String[] args) {


        // Soru 6- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz: ");
        int sayi = scan.nextInt();

        if (sayi<=0){
            System.out.println("Gecersiz sayi");
        }else {
            System.out.println(tamBolenlerListesiOlustur(sayi));
        }


    }

    public static List<Integer> tamBolenlerListesiOlustur (int sayi){

        List<Integer> tamBolenler = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi%i == 0){

                tamBolenler.add(i);
            }
        }
     return tamBolenler;
    }
}
