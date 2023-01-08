package ders33_final_abstractClasses;

public abstract class DParent {

    // Child class'larin tamamında method1 ve method2'nin MUTLAKA OLMASINI istiyoruz

    /*
        Java parent class'daki istenen methodlari child class'larin override etmek
        ZORUNDA KALMASI icin abstract class'ini olusturmustur

        Bir class'ı abstract yapmak istersek class deklarasyonuna abstract yazmamiz yeterlidir

        Bir abstract class'in icinde child class'larin override etmesi
        MECBURİ olan method'lar olabilecegi gibi MECBURI olmayan method'lar da olabilir

        Chil class'larin mutlaka OVERRİDE EDECEGİ method'lari da abstract yapariz

        abstract yapilan butun method'lar child class'larin tamaminda override edileceginden
        parent class'daki abstract method'un body'e ihtiyaci olmaz.
        Java'da abstract method'larin body'si olmasina izin vermez

         Abstract class'larda abstract method'lar bulundugu icin
        Abstract class'lardan OBJE URETILEMEZ
     */

    public abstract void method1();

    public abstract void method2();

    public void method3(){
        System.out.println("parent class'daki method3 calisti");
    }
}
