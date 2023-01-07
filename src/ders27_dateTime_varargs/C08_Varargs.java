package ders27_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {

        /*
            argument olarak tam sayilar alıp
            ilk argument haric geriye kalanlari toplayıp
            bulunan toplami ilk argument ile carpip
            sonucu yazdiran bir method olusturun
            not: argument sayisi degisken olabilir
         */

        islemYap(3,4,5,8,1,2);
        islemYap(5,1);
        islemYap(4);
        islemYap(3,4,5,6);

    }

    private static void islemYap(int ilkSayi, int... geriyeKalanlar) {

        int geriyeKalanlarToplami = 0;

        for (int each: geriyeKalanlar
             ) {
            geriyeKalanlarToplami += each;
        }

        System.out.println(geriyeKalanlarToplami*ilkSayi);

    }
}
