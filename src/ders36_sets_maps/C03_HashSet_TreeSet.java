package ders36_sets_maps;

import java.util.*;

public class C03_HashSet_TreeSet {
    public static void main(String[] args) {

        // bir hashSet ve bir treeSet olusturun
        // bir loop ile iclerine rastgele 100000 sayi ekleyin
        // islem surelerini karsilastirin

        Random rnd = new Random();
        Set<Integer> hash = new HashSet<>();
        Set<Integer> tree = new TreeSet<>();


        Long hasBaslangic = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            hash.add(rnd.nextInt(10000000));
        }

        Long hasBitis = System.currentTimeMillis();


        Long treeBaslangic = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            tree.add(rnd.nextInt(10000000));
        }

        Long treeBitis = System.currentTimeMillis();

        System.out.println("HasSet süresi :" + (hasBitis-hasBaslangic));
        System.out.println("TreeSet SÜresi :" + (treeBitis-treeBaslangic));
    }
}
