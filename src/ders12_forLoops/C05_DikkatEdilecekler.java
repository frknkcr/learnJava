package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {

        int sayi = 103;
        Boolean asalMi = false;

        for (int i = 2; i <= sayi-1 ; i++) {

            if (sayi%i==0){
                asalMi=true;
                break;
            }
        }

        if (asalMi==false){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }

    }
}
