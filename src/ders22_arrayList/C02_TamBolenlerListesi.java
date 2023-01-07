package ders22_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan pozitif bir tamsayi alip,
        //        o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi girin: ");
        int sayi = scan.nextInt();
        System.out.println(tamBolenlerListesiOlustur(sayi));


    }
    public static List<Integer> tamBolenlerListesiOlustur(int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0){

                tamBolenlerListesi.add(i);

            }

        }
        return tamBolenlerListesi;
    }
}
