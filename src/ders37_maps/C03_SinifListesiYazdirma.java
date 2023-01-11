package ders37_maps;

import ders36_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdirma {
    public static void main(String[] args) {

        // Verilen siniftaki ogrencilerin bilgilerini yazdiran bir method olusturalim

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"10");


    }
}
