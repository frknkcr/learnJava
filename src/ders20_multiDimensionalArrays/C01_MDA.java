package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int [][] arr = {{4,3,1},{1,2},{5,6,7},{},{3,6,8,8}};

        System.out.println(arr.length);

        System.out.println(arr[2].length);

        System.out.println(Arrays.toString(arr[1]));

        System.out.println(Arrays.deepToString(arr));

    }
}
