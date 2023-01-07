package ders19_arrays;

import java.util.Arrays;

public class C01_ElemanlariSagaKaydirma {
    public static void main(String[] args) {

        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int[] arr={4,5,6,7};
        System.out.println(Arrays.toString(sagaKaydir(arr)));

    }

    public static int[] sagaKaydir (int[] arr){

        int index = 0;

        for (int i = arr.length-1; i >= 0; i--) {

            if (i == arr.length-1){
                index = arr[arr.length-1];
            }else {
                arr [i+1] = arr[i];
            }
        }
        arr[0] = index;
        return arr;
    }
}
