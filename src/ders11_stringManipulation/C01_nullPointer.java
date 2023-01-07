package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1 = "";
        // str1 e deger atanmıtır

        String str2;
        // str2 olusturuldu ama deger atanmadı
        // deger atanmadıgı icin yazdirilmaz

        str2= "Java candir";
        System.out.println(str2);
        System.out.println(str2.concat("."));

        String str3 = null; //str3 e deger atanmamıstır
        // null pointer ile javaya deger atamadıgımızın farkinda oldugumuzu soyluyoruz

        System.out.println(str3 + "Java");

        System.out.println(str3.toUpperCase());

    }
}
