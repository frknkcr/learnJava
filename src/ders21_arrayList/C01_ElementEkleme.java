package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar);

        System.out.println(sayilar.add(10)); // true

        System.out.println(sayilar);

        sayilar.add(20);

        System.out.println(sayilar); // tersi soylenmedikce elementi sona ekler

        sayilar.add(1,15);

        System.out.println(sayilar);

        // listenin basina 44 ekleyin

        sayilar.add(0,44);

        List<Integer> eklenecekListe = new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);

        // sayilar sistesinin sonuna eklenecekListe'yi ekleyin

        sayilar.addAll(eklenecekListe);

        System.out.println(sayilar);

        // sayilar listesinin basindaki 44 den sonraya eklenecekListe'yi ekleyin

        sayilar.addAll(1,eklenecekListe);

    }
}
