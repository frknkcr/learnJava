package ders38_maps_nestedMaps;

import ders36_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value degerinin tamami sorulursa true, bir parcasi sorulursa false doner

        System.out.println(ogrenciMap.getOrDefault(103, "Ogrenci bulunamadi"));
        // Ali-Cem-11-K-TM

        System.out.println(ogrenciMap.getOrDefault(123,"Ogrenci bulunamadi"));
        // Ogrenci bulunamadi

        System.out.println(ogrenciMap.get(123)); // null

        ogrenciMap.replace(103,"Ali-Cem-11-K-TM");

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM

        ogrenciMap.put(103,"Ali-Cem-12-K-TM");

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-12-K-TM





    }

}
