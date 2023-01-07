package ders32_exceptions;

import java.util.Scanner;

public class C05_MultipleException {
    public static void main(String[] args) {

        /*
            Eger birden fazla exception olusma ihtimali varsa
            bu exception'lar birbirinden bagimsiz ise
                1- tek try catch yapabiliriz
                2- ikisi icin ic ice try cath yapabilirim
                3- iki excaption'i da kapsayan tek bir catch yapabilirim
         */

        String str = "Java'da cok fazla exception var";
        int[] arr =  {3,5,1,3,2,6,3,6,8,5,2};

        // kullanicidan bir tamsayi alin
        // ve girilen sayiyi index olarak kullanip
        // str ve arr'den o indexdeki elementleri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi girin");
        int input = scan.nextInt();

        /*
        // 1. cozum
        try {
            System.out.println(arr[input]);
            System.out.println(str.charAt(input));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("İstenen index String'in sinirlari disinda");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("İstenen index array'in sinirlari disinda");
        }
        */


        /*
        // 2. cozum
        try {
            try {
                System.out.println(str.charAt(input));
                System.out.println(arr[input]);
            }catch (Exception e){
                System.out.println("İstenen index String'in sinirlari disinda");
            }
        } catch (Exception e) {
            System.out.println("İstenen index array'in sinirlari disinda");
        }
        */

        // 3. cozun tek ama daha kapsamli bir exception kullanma

        try {
            System.out.println(str.charAt(input));
            System.out.println(arr[input]);
        }catch (RuntimeException e){
            System.out.println("Index String ve/veya Array'in sinirlari disinda");
            e.printStackTrace();
        }

    }
}
