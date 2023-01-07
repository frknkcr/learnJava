package ders09_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8));
        // 5. index'den baslar (8-5) karakter yazdirir
        // 5. index dahil (inclusive), 8. index hariç (exclusive)

        // gectikce yazdirin

        System.out.println(str.substring(9,17));

        System.out.println(str.substring(3,7));

        String isim = "HASAN";
        // verilen ismi ilk harfi kucuk gerisi buyuk har olarak kaydedin

        isim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase();

        System.out.println(isim);

        // sedece 3. harfi yazdirin

        System.out.println(isim.substring(3,4));

        System.out.println("zor sorunun cevabi: "+ isim.substring(2,2)); // "" hiçlik yazdirir

        // System.out.println(isim.substring(5,2)); // hata verir


    }
}
