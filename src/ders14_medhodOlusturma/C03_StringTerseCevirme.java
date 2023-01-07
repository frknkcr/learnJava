package ders14_medhodOlusturma;

public class C03_StringTerseCevirme {

    // parametre olarak bir String kabul edip
    // String'in terse cevrilmis halini döndüren bir method olusturun

    public static void main(String[] args) {

        String input = "Java kod yazdikca ogrenilir";

        System.out.println(StringiTerseCevir(input));

    }

    public static String StringiTerseCevir(String input){
        String tersStr="";

        for (int i = input.length()-1; i >= 0 ; i--) {

            tersStr = tersStr+input.charAt(i);

        }
        return tersStr;
    }
}
