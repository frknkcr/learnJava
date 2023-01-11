package ders37_maps;

import ders36_sets_maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArttirma {
    public static void main(String[] args) {

        // ogrenci map'indeki tum sinif degerlerini 1 arttirin

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap = MapMethodDepo.siniflariArttir(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);
    }
}
