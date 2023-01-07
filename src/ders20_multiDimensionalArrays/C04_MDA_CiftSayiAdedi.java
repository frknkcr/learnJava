package ders20_multiDimensionalArrays;

public class C04_MDA_CiftSayiAdedi {
    public static void main(String[] args) {

        // Verilen iki katli bir int array'deki cift sayi adedini bulan kod yaziniz

        int[][] arr= {{4,6},{3,5,8},{1,0,4}};

        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[i][i] %2 == 0){
                    count++;
                }
                if (count==0){
                    System.out.println("Çift sayi yok");
                }
            }
        }
        System.out.println(count+" Tane cift sayi var");
    }
}
