package ders11_stringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {

        // kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        // NOT: space silinmemeli

        String input = "Ja5+va cok 1*guzel";

        input = input.replaceAll("\\d",""); // Ja+va cok *guzel
        input = input.replace(" ", "5"); // Ja+va5cok5*guzel
        input = input.replaceAll("\\W",""); // Java5cok5guzel
        input = input.replaceAll("5"," "); // Java cok guzel
        input = input.replaceAll("\\s+"," "); // cift space olan yerleri degistirir

        System.out.println(input);

    }
}
