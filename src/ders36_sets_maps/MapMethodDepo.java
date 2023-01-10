package ders36_sets_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    // Bize ogrenciMap donduren bir method olusturun

    public static Map<Integer,String> ogrenciMapOlustur (){

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-Mf");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-K-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        // 1- tum value'ları bir collection olarak kaydedelim
        // [, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-K-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
            Collection<String> valuesCollection =  ogrenciMap.values();
        // 2- for-each kullanarak her bir value'yu ele alalim Ali-Can-11-H-Mf
        // 3- -'yi kullanarak split yapalim [Ali, Can, 11, H, MF]
        // 4- split yaptigimiz array'den isim bilgisini alalim 0.index
        // 5- eger value'den aldigimiz isim ararnan isim ile ayni ise
        //    true dondurup donguyu bitirelim
        // 6- eger for-each bittiginde true olmadiysa false dondurelim

        for (String eachValue:valuesCollection) {

            String[] valueArr = eachValue.split("-");
            String valueIsim = valueArr[0];
            if (valueIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }
        return false;
    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {

        /*
            1- map'deki value'leri bir collection olarak kaydedelim

            2- for-each ile her bir value bilgisini ele alalim
            3- value'yu - ile split yapip bir array elde edelim
            4- array'in 1. index'indeki soyisme bakip, aranan soyisim ile ayni ise
                isim, soyisim, sinif, ve sube bilgilerini yazdiralim
         */

        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        System.out.println("Isim Soyisim Sinif Sube");

        for (String eachValue:ogrenciValueCollection) {

            String[] valueArr = eachValue.split("-");
            String valueSoyisim = valueArr[1];

            if (valueSoyisim.equalsIgnoreCase(soyisim)){
                System.out.println(valueArr[0]+ " "+
                                    valueArr[1]+ " "+
                                    valueArr[2]+ " "+
                                    valueArr[3]);
            }
        }
    }

    public static void subeListesiYazdiema(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection = ogrenciMap.values();

        System.out.println("Isim Soyisim");

        for (String eachValue:valueCollection) {

            String[] valueArr = eachValue.split("-");

            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)){

                System.out.println(valueArr[0]+" "+ valueArr[1]);
            }

        }

    }

    public static Map<Integer,String> numaraIleSUbeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSube) {

        String ogrenciValue = ogrenciMap.get(okulNo);
        String[] valueArr = ogrenciValue.split("-");

        valueArr[3] = yeniSube;

        String yeniValue = valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

        ogrenciMap.put(okulNo,yeniValue);

        return ogrenciMap;
    }
}
