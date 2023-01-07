package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {

        String str= "java gercekten cok cok guzel";
        // verilen str'da kac tane e harfi oldugunu bulunuz

        String[] newArray = str.split("e");
        System.out.println(Arrays.toString(newArray));
        System.out.println(newArray.length);

        System.out.println("Metindeki e sayisi: "+ (newArray.length-1));

        // 2.yontem
        // String'i "" ile split yaparak karakterlerine ayiralim

        String[] tumKarakterlerArr = str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));

        int count = 0;

        for (int i = 0; i < tumKarakterlerArr.length; i++) {

            if (tumKarakterlerArr[i].equals("e")){
                count++;
            }
        }

        System.out.println("Array'daki e sayisi: "+count);
    }
}
