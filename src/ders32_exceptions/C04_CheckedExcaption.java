package ders32_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExcaption {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/t108_ders28_exceptions/main.txt");

         /*
            Bazi kodlari yazdigimizda Java compile time sirasinda
            o kodlarda exception riskini gorur ve bizden bir cozum bekler
            Ozellikle dosya okuma ve yazma ile ilgili
            IO (Input/Output) islemlerinde Java ya okuyamazsam, ya yazamazsam diyerek
            bizden compile time'da cozum ister
            bu durumda biz exception ile karsilasildiginda
            kod dursun diyorsak : method satirina throws keyword kullanarak
                                  beklenilen exception(lar)i deklare edebiliriz
                                  Bu sadece olayin farkinda oldugumuzu deklare eder
                                  exception firlatmanin ve kodu durdurmanin onune gecmez
            kod calismaya devam etsin : try-catch-(finally) blogu kullanabiliriz
         */

    }
}
