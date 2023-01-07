package ders14_medhodOlusturma;

public class C05_SubStringOlustur {

    //Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
    //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
    //bir method olusturun.
    //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
    //mesaji verin
    //- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
    //yazdirin

    public static void main(String[] args) {
        String input = "Java ne kadar guzel";
        int basIndexi =5;
        int bitisIndexi= 7;

        kendiSubStringMethodumuz(input, basIndexi, bitisIndexi);
        kendiSubStringMethodumuz("java",1,3);
        kendiSubStringMethodumuz("Deneme",6,3);
        kendiSubStringMethodumuz("Java", 1,8);
    }

    public static void kendiSubStringMethodumuz(String input, int basIndexi, int bitisIndexi){

        if (basIndexi>bitisIndexi){
            System.out.println("Baslangıc indexi bitis indexinden buyuk olamaz");
        } else if (bitisIndexi>=input.length()) {
            System.out.println("Bitis indexi String'in sinirlari disinda");
        }else
            for (int i = basIndexi; i < bitisIndexi; i++) {
                System.out.print(input.charAt(i));
            }
        System.out.println();

    }

}
