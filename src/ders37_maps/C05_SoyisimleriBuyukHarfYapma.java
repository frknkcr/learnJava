package ders37_maps;

import ders36_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapma {

    public static void main(String[] args) {

        // Map'deki soyisimleri buyuk harfe ceviren method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap= MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);

    }

}
