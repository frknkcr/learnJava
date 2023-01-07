package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriniArtirma;
import ders18_arrays.C04_ArrayElementleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {

        // verilen bir int array'in elementlerini 2 artirin

        int[] arr= {2,3,4};
        arr = C03_ArrayElementleriniArtirma.elementi2Arttir(arr);
        System.out.println(Arrays.toString(arr)); // [4, 5, 6]

        // arr array'inin elementlerini toplayip yazdirin
        System.out.println(C04_ArrayElementleriToplama.arrayElemetleriToplama(arr));

        // arr array'inde 10 elementi var mi ?
        C05_ArraydeElemanArama.elemanAra(arr,10);

        // kullanicidan array alarak array olusturun
        int[] yeniArr = C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));
    }
}
