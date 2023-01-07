package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // ilk kucuk a nın index ini döndürür

        System.out.println(str.indexOf('c'));

        System.out.println(str.indexOf("hersey"));

        System.out.println(str.indexOf("e",9)); // 13

        // 13. index'deki e'den bir sonraki e'nin index'ini bulalım

        System.out.println(str.indexOf("e",14));

        // cumledeki 2. c'nin index'inin yazdirin

        int ilkcindex = str.indexOf("c");

        System.out.println(str.indexOf("c",ilkcindex+1));

        System.out.println(str.indexOf("ali")); // olmayan şeyler -1 döner




    }
}
