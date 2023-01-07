package ders24_constructor;

public class C02_Constructor {
    public static void main(String[] args) {

        /*
            Bir obje olusturulurken
            istedigimiz ozallikleri direk atayabilirsek
            sonradan tekrar bir atama islemi yapmama gerek kalmaz

            Bu durumda atamayi tek tek bizim yapmamiz yerine
            constructor'in atama yapmasini istemeliyiz

            atama yapmak icin constructor'a parametre göndermeliyiz
         */

        karesiniYazdir(5);
        karesiniYazdir(10);

        Car car1 = new Car("BMW", "5.20", 2020 , 15000, "Beyaz");

        System.out.println(car1);

        Car car2 = new Car("Tofas", "Sahin", 2010);

        System.out.println(car2);

        Car car3 = new Car("Toyota","Corolla",2016,"Gri");

        System.out.println(car3);

    }

    public static void karesiniYazdir (int sayi){
        System.out.println(sayi*sayi);
    }

}
