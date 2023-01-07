package ders04_matematikselİslemler_incrementDecrement;

import java.util.Scanner;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        // kullanicinin girdigi 4 basamakli bir sayının
        // rakamlar toplamini veren bir kod yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dört basamaklı bir sayı girin : ");

        int input = scan.nextInt();

        int birlerBasamagi;
        int rakamlarToplami=0;

        // birler basamagini al
        birlerBasamagi = input % 10;
        // birler basamagini rakamlar taplamina ekle
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        // birler basamagindan kurtul
        input = input/10;

        // birler basamagini al
        birlerBasamagi = input % 10;
        // birler basamagini rakamlar taplamina ekle
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        // birler basamagindan kurtul
        input = input/10;

        // birler basamagini al
        birlerBasamagi = input % 10;
        // birler basamagini rakamlar taplamina ekle
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        // birler basamagindan kurtul
        input = input/10;

        // birler basamagini al
        birlerBasamagi = input % 10;
        // birler basamagini rakamlar taplamina ekle
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        // birler basamagindan kurtul
        input = input/10;

        System.out.println("Girilen sayının rakamlar toplamı : " + rakamlarToplami);



    }
}
