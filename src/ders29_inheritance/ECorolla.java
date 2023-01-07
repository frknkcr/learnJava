package ders29_inheritance;

public class ECorolla extends DToyota {

    ECorolla(){
        System.out.println("Parametresiz Corolla constructor'ı calisti");
    }

    ECorolla(String param1){
        super("Gri");
        System.out.println("Parametreli Corolla constructor'ı calisti");
    }

    String model ="Corolla";
    String uretimYeri ="Turkiye";

    public static void main(String[] args) {

        ECorolla cor1 =new ECorolla("mavi");



    }

    /*
        Bir obje olusturuldugunda ilk deger atamasi yapilabilmesi icin
        constructor calismalidir.

        ınheritance'da biliyoruz ki
        child class'dan olusturulan her obje
        parrent class'daki ozelliklere de sahip olur

        prrent class'daki ozelliklere sahip olabilmesi icin
        parent class'daki constructor'lar da calismalidir

        Java bu calismayi super() sayesinde saglar

        Java'da her olusturulan class'da gorunmese de default constructor oldugu gibi
        extends keyword kullanilan her class'da kullanilan her constructor'in
        ilk satirinda görünmese de super() vardir
     */

}
