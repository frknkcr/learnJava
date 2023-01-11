package ders37_maps;

import ders36_sets_maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.bolumListesiOlusturma(ogrenciMap,"MF");

    }
}
