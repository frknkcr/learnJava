package ders28_StringBuilder;

public class C04_AccessModifier {

    String str;
    // Access modifier'i gozlerimizle goremiyorsak
    // default access modifier var demektir

    // Bu class'da default constructor vardır
    // str'in default degeri null
    // str'in access modifier'i default access modifier


    public static void main(String[] args) {

        D obj1= new D();
        System.out.println(obj1.isimDefault); // Furkan
        obj1.defaultStaticOlmayanMethod();
        // default access modifier'li static olmayan method calisti

        // baska class'lardaki class uyelerine erisimde
        // access modifier ve static keyword'u dikkate alinmalidir
        // static class uyelerini obje uzerinden kullanmaya gerek yoktur
        // illa da obje uzerinden kullanmak isterseniz
        // clas uyesinin ismini yazmaniz gerekir

        System.out.println(obj1.isimDefaultStatic); // Sevilay
        System.out.println(D.isimDefaultStatic);// Sevilay

        D.isimDefaultStatic="Mehmet";

        obj1.defaultStaticMethod();
        D.defaultStaticMethod();
        // default access modifier'li static method calisti

    }
}
