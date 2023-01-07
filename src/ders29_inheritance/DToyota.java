package ders29_inheritance;

public class DToyota extends CCar {

    DToyota(){
        System.out.println("Parametresiz Toyota constructor'ı calisti");
    }

    DToyota(String param1){
        System.out.println("Parametreli Toyota constructor'ı calisti");
    }

    String marka = "Toyota";
    String uretimYeri = "Toyota farkli ulkelerde uretilir";
}
