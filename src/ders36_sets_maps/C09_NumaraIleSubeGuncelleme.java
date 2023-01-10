package ders36_sets_maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {

        // Numarasi verilen ogrencinin sube ismini
        // verilen sube yapan bir mthod olusturun

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap = MapMethodDepo.numaraIleSUbeDegistirme(ogrenciMap,104,"M");

        System.out.println(ogrenciMap);


    }
}
