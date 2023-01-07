package ders14_medhodOlusturma;

public class C07_AsalSayiKontrol {
    public static void main(String[] args) {
        int sayi = 24;

        System.out.println(asalSayiKontrolEt(sayi));
        System.out.println(asalSayiKontrolEt(23));
    }
    
    public static String asalSayiKontrolEt(int sayi){

        String sonuc ="";

        for (int i = 2; i <= (sayi-1) ; i++) {

            if (sayi%i==0) {
                sonuc = "asal degil";
                break;
            }

        }
        if (!sonuc.equals("asal degil")){
            sonuc = "asal";
        }
        return sonuc;
    }
    
}
