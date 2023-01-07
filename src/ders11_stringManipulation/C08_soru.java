package ders11_stringManipulation;

public class C08_soru {
    public static void main(String[] args) {

        // : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali

        String sifre = "adanaadan7";
        int flag = 0;

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("Ilk harf kucuk olmali");
            flag++;
        }

        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("Son karakter rakam olmali");
            flag++;
        }

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag++;
        }

        if (!(sifre.length()==10)){
            System.out.println("Uzunlugu en az 10 karakter olmali");
            flag++;
        }

        if (flag==0){
            System.out.println("sifreniz basari ile olusturuldu");
        }

    }
}
