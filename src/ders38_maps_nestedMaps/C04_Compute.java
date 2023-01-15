package ders38_maps_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C04_Compute {
    public static void main(String[] args) {

        // verilen bir String array'de her bir sayinin kacar defa kullanildigini yazdirin
        // Ornek : String[] arr = {"A","C","B","N","A","N","A"}
        // Output : A=3, B=1, C=1, N=2

        String[] arr = {"A","C","B","N","A","N","A"};

        Map<String,Integer> harfSayilari =new TreeMap<>();

        // 1. yöntem

        for (String s : arr) {

            if (!harfSayilari.containsKey(s)) {

                harfSayilari.put(s, 1);
            } else {
                harfSayilari.put(s, (harfSayilari.get(s) + 1));
            }
        }
        System.out.println(harfSayilari);

        // 2. yöntem compute
        Map<String,Integer> hardSayilari2 =new TreeMap<>();

        for (String s : arr) {

            hardSayilari2.computeIfPresent(s, (k, v) -> v + 1);
            hardSayilari2.computeIfAbsent(s, v -> 1);

        }
        System.out.println(hardSayilari2);
    }
}
