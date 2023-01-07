package ders18_arrays;

public class C07_EnKisa_EnUzunKelime {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr ={"Hasan", "Ilker","Senturk","Omer Faruk"};

        kelimeYazdir(arr);
    }

    public static void kelimeYazdir(String[] arr){

        String enUzun = arr[0];
        String enKisa = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (enUzun.length() < arr[i].length()){
                enUzun = arr[i];
            }
            if (enKisa.length() > arr[i].length()){
                enKisa = arr[i];
            }
        }
        System.out.println("En kisa kelime: "+enKisa);
        System.out.println("En uzun kelime: "+enUzun);
    }
}
