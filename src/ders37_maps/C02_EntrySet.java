package ders37_maps;

import ders36_sets_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        // tum ogrencileri 101= Ali-Can-11-H-MF seklinde yazdirin

        Map<Integer, String> ogrenhciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println("No   Ogrenci bilgileri");
        System.out.println("======================");

        Set<Integer> ogrenciNoSet = ogrenhciMap.keySet();

        for (Integer eachKey:ogrenciNoSet) {

            System.out.println(eachKey +"= "+ogrenhciMap.get(eachKey));
        }

        /*
            Aslinda bizden istenen map'in icindeki elementler
            Java map'deki elementleri key-value ikilisi olarak birlikte alabilmemiz icin
            ENTRY class'ini olusturmustur

            entry'ler de map ile ayni data yapisina sahip olmalidir
            ornegin ogrenci map'ini dusunursek

            Entry<Intager, String>
         */

        Set<Map.Entry<Integer, String>> ongrenciEntrySet = ogrenhciMap.entrySet();

        for (Map.Entry<Integer,String> entryEach: ongrenciEntrySet){
            System.out.println(entryEach);
        }

    }
}
