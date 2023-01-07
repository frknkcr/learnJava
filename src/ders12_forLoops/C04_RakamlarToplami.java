package ders12_forLoops;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        // kullanicinin verdigi sayinin rakamlar toplamını bulun

        long sayi = 945352326332132665L;
        String sayiStr= ""+sayi;

        long birlerBasamagi=0;
        long rakamlarToplami=0;

        for (int i = 1; i <= sayiStr.length(); i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami= rakamlarToplami+birlerBasamagi;
            sayi= sayi/10;
        }

        System.out.println(rakamlarToplami);

    }
}
