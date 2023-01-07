package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDA_ElementleriToplama {
    public static void main(String[] args) {

       int[] arr1 = {3,5,7,8};

       int toplam= 0;

        for (int i = 0; i < arr1.length; i++) {
            toplam += arr1[i];
        }
        System.out.println("Tek katli array elementler toplami: "+toplam);

        int[][] arr2 = {{1,2},{3,4,5},{7}};

        toplam = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                toplam += arr2[i][j];

            }
        }
        System.out.println("2 katli array'in elementleri toplami: "+ toplam);
    }
}
