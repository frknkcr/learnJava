package ders16_doWhileLoop;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        int sayi = 10;
        int toplam = 0;

        do {
            toplam += sayi;
            sayi++;
        }while(sayi<=12);

        System.out.println(toplam);

    }
}
