package ders27_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime zaman = LocalTime.now();
        System.out.println(zaman);

        System.out.println(zaman.getMinute());

        System.out.println(zaman.withSecond(0).withNano(0));

        System.out.println(zaman.withSecond(1).withNano(1));

        System.out.println(zaman.plusHours(100).plusMinutes(250));

        // bir for loop ile 1'den 10000'e kadar olan sayileri yanyayna yazdirin
        // bu islem icin gecen zamani bulun


        LocalTime basZamani = LocalTime.now();

        System.out.println("baslangic "+basZamani);
        for (int i = 1; i <= 10000; i++) {

            System.out.print(i+" ");

        }
        LocalTime bitZamani = LocalTime.now();

        System.out.println();
        System.out.println("bitis "+bitZamani);

        System.out.println("islem suresi : "+
                            (bitZamani.getNano()-basZamani.getNano())+" nano saniye");

        /*
            Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
            olusturdugumuz satirdaki zamani veya tarihi sistemden alip kaydeden bir veriable'dir

            ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
            yeni bir time veya date objesi oluşturup
            o andaki degeri alabiliriz
         */

    }
}
