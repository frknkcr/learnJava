package ders38_maps_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C04_Compute {
    public static void main(String[] args) {

        // verilen bir String array'de her bir sayinin kacar defa kullanildigini yazdirin
        // Ornek : String[] arr = {"A","C","B","N","A","N","A"}
        // Output : A=3, B=1, C=1, N=2

        String[] arr = {"A","C","B","N","A","N","A"};

        Map<String,Integer> hardSayilari =new TreeMap<>();

        // 1. yöntem

        for (String s : arr) {

            if (!hardSayilari.containsKey(s)) {

                hardSayilari.put(s, 1);
            } else {
                hardSayilari.put(s, (hardSayilari.get(s) + 1));
            }
        }
        System.out.println(hardSayilari);

        // 2. yöntem
        Map<String,Integer> hardSayilari2 =new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {

            hardSayilari2.computeIfPresent(arr[i],(k,v) -> v+1);
            hardSayilari2.computeIfAbsent(arr[i],v->1);

        }
        System.out.println(hardSayilari2);
    }
}
