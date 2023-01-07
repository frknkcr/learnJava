package ders19_arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEklemeMethodu {
    public static void main(String[] args) {

        // verilen bir int array'e istenen bir elementi ekleyip
        // yeni halini bize donduren bir method olusturun

        int[] abc= {3,5,8,9,6,7,3,4};
        int eklenecekSayi=10;

        arrayeElemanEkle(abc,eklenecekSayi);
        System.out.println(Arrays.toString(abc));
    }

    public static int[] arrayeElemanEkle (int[] arr, int yeniEleman){

     int[] arr2 = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            arr2[i] = arr[i];
        }
        arr2[arr2.length-1] = yeniEleman;
        arr = arr2;
        return arr;
    }
}
