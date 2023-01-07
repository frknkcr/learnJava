package ders04_matematikselİslemler_incrementDecrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a = 10;

        // a veriable'nın degerini yazdirip, sonra a nın degerini 1 arttirin

        System.out.println("a: "+ a);
        a++;

        int b = 10;

        // b veriable'nın degerini 1 arttirip, sonra yazdirin

        b++;
        System.out.println("b : "+b);

        int c = 10;

        // c veriable'nın degerini yazdirip, sonra c nın degerini 1 arttirin

        System.out.println("c : "+ c++);

        int d = 10;

        // d veriable'nın degerini 1 arttirip, sonra yazdirin

        System.out.println("d : "+ ++d);

        /*
        c++ veya ++d yi yazdirma veya atama isleminde kullanirsaniz
        c++ 'ya post increment denir o satir icin once islemi yapar sonra arttirma yapar
        ++d 'ye ise pre increment denir, once arttirma yapip sonra islemi yapar

        islemin oldugu satirin bir alt satirina gecildiginde
        c'de d'de bir artmistir
         */

    }
}
