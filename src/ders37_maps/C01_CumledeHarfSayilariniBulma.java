package ders37_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfSayilariniBulma {
    public static void main(String[] args) {

        // Verilen cumlede kullanilan her bir harfi
        // ve kacar kez kullanildigini yazdirin

        // ornek= Java candir
        // output= J=1, a=3, v=1, c=1, n=1, d=1, i=1, r=1


        String cumle = "Java candir.";

        // oncelikle bosluk ve noktalama isaretlerini yok edelim

        cumle= cumle.replaceAll("\\W",""); // Javacandir

        String[] cumleArr = cumle.split(""); // [J, a, v, a, c, a, n, d, i, r]

        Map<String,Integer> kullanimSayilariMap = new TreeMap<>();

        for (String s : cumleArr) {
            // her bir elementi ele alip
            // map'de key olarak yoksa value=1 olarak ekleriz
            // map'de key olarak varsa value " arttirilmali

            if (!kullanimSayilariMap.containsKey(s)) {
                kullanimSayilariMap.put(s, 1);
            } else {
                int eksiValue = kullanimSayilariMap.get(s);
                kullanimSayilariMap.put(s, eksiValue+1);
            }

        }

        System.out.println(kullanimSayilariMap);


    }
}
