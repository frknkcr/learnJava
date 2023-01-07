package ders23_arrayList_forEachLoop;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

        String cumle="Java ogrenmek cok guzel";
        String harf= "e";

        String[] cumleArr = cumle.split("");

        int count = 0;

        for (String each: cumleArr
             ) {

            if (each.equals(harf)){

                count++;
            }
        }

        if (count == 0){
            System.out.println("Harf cumlede kullanilmamis");
        }else {
            System.out.println("Harf cumlede " + count + " defa kullanilmis.");
        }
    }
}
