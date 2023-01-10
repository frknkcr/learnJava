package ders36_sets_maps;

import java.util.*;

public class C01_Set {
    public static void main(String[] args) {
        // Collection, objelerden olusan bir toplulugu bir arada tutan yapilardir
        // Data turu olarak Object secilirse, icerisinde her data turunden element konulabilir
        // ancak bu durumda elementlere ulasmak, onlari update etmekgibi islemler
        // normalden daha zor olabilir
        // hatta bazen mumkun olmayabilir
        Set<Object> karisikSet = new HashSet<>();

        karisikSet.add(12);
        karisikSet.add("Java");
        karisikSet.add('S');
        karisikSet.add(false);

        int[] arr = new int[3];
        arr[2] = 23;
        arr[1] = 10;

        karisikSet.add(Arrays.toString(arr));

        List<Object> karisikList = new ArrayList<>();
        karisikList.add("Hava");
        karisikList.add(44);

        karisikSet.add(karisikList);

        System.out.println(karisikList); // [Hava, 44]

        System.out.println(karisikSet); // [Java, S, false, [0, 0, 0], 12, [Hava, 44]]

        System.out.println(karisikSet.contains(44)); // false
        System.out.println(karisikSet.contains(12)); // true

        System.out.println(karisikSet.size()); // 6
    }
}
