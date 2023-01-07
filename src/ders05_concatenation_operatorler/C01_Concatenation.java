package ders05_concatenation_operatorler;

public class C01_Concatenation {
    public static void main(String[] args) {

        // sadece asagıda verilen variable'lari kullanarak istenen degerleri yazdiralim

        String s1 = "Java";
        String s2 = "Guzeldir";
        String s3 = "";
        String s4 = " ";

        int sayi1 = 4;
        int sayi2 = 3;

        // Java Guzeldir7

        System.out.println((s1+s4)+s2+(sayi1+sayi2));

        System.out.println(s1+s4+s2+(sayi1+sayi2));

        // Java Guzeldir 12

        System.out.println(s1+s4+s2+s4+(sayi1*sayi2)); // carpma islemini parantez icine almasak da calısır islem onceligi

        // 7Java Guzeldir

        System.out.println(sayi1+sayi2+s1+s4+s2);

        // 34 Java

        System.out.println(s3+sayi2+sayi1+s4+s1);

        // Java7 Guzeldir34

        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);


    }
}
