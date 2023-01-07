package ders27_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // kac tane string argument yazılırsa yazilsin
        // argumentlerin en uzun olanını yazdiran bir method olusturun
        // Not: en uzun kelime olarak birden fazla kelime varsa, ilkini yazdirin

        enUzunuYazdir("Ilyas","Berivan","Murat");
        enUzunuYazdir("Mehmet","Vahit","Nurcan","Java","Zafer","Kerime");
    }

    private static void enUzunuYazdir(String... kelimeler) {

        String enUzunKelime = kelimeler[0];

        for (String each: kelimeler) {

            if (each.length()>enUzunKelime.length()){
                enUzunKelime = each;
            }
        }
        System.out.println(enUzunKelime);
    }
}
