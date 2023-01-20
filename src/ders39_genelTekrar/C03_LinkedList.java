package ders39_genelTekrar;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {

    public static void main(String[] args) {

        // Verilen bir linkedList'de
        // istenen iki index'deki elementlerin yerini degistirin

        LinkedList<String> isimler = new LinkedList<>(Arrays.asList("Said","Hasan","sevilay","Humeyra"));
        System.out.println(isimler);

        // hasan ile humeyranın yerlerini degistirelim
        // buyuk bir listede index bilmeden yapalim

        String ilkIsim = "Said";
        String ikinciIsim = "Humeyra";

        int ilkIndex = isimler.indexOf(ilkIsim);
        int sonIndex = isimler.indexOf(ikinciIsim);

        isimler.set(ilkIndex,ikinciIsim);
        isimler.set(sonIndex,ilkIsim);

        System.out.println(isimler);

    }
}
