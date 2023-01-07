package ders22_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotsayisi {
    public static void main(String[] args) {


        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den buyuk bir sayi girip, bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double> notlar = listeolustur();

        System.out.println(notlar);

        raporla(notlar);
    }

    public static List<Double> listeolustur() {

        List<Double> notlar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Double girilenNot = 5.0;

        while (girilenNot<=100 && girilenNot>=0) {

            System.out.println("Lütfen listeye eklemek icin not giriniz " +
                    "\nBitirmek icin 100'den buyuk bir sayi girin");
            girilenNot = scan.nextDouble();

            if (girilenNot<=100 && girilenNot>=0) {
                notlar.add(girilenNot);
            }
        }
        return notlar;
    }

    public static void raporla(List<Double> notlar){

        int ogrenciSayisi = notlar.size();
        double notlarToplami = 0.0;
        double sinifNotOrtalamasi = 0.0;
        int ortalamaUstundekiOgrenciSayisi = 0;

        for (int i = 0; i < notlar.size(); i++) {

            notlarToplami += notlar.get(i);

        }
        sinifNotOrtalamasi = notlarToplami / ogrenciSayisi;

        for (int i = 0; i < ogrenciSayisi; i++) {

           if (notlar.get(i)>sinifNotOrtalamasi){
               ortalamaUstundekiOgrenciSayisi++;
           }
        }

        System.out.println("Girilen not sayisi: "+ ogrenciSayisi+
                "\nGirilen notlarin ortalaması: " +sinifNotOrtalamasi+
                "\nOrtalama ustunde not alan ogrenci sayisi: "+ortalamaUstundekiOgrenciSayisi);

    }
}
