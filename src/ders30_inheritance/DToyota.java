package ders30_inheritance;

public class DToyota {

    /*
        Bir objenin data turu, constructor olarak kullanilan class
        veye o class'in parent class'lari olabilir

        Data turu olarak parent class secilmesinde amac
        child class'dan olusturulan objenin parent class'in tum child class'larinin tasidigi
        ortak ozellikleri vurgulamaktir
        (personel toplantisinina katılan doktor kemal gibi)


        Data turu ile constructor farkli oldugunda
        veriable ile method'lar farkli davranirlar

        veriable'larin alacagi degeri bulmak icin
        aramaya data turu olan class'dan baslariz
        o class'da yoksa parent'larina bakariz
        ve ilk buldugumuz degeri atama yapariz

        data turu olan class veya parent'larinda bulunamazsa CTE olur

     */


    String marka ="Toyota";
    String model ="Model belirtilmedi";
    String motor ="Motor belirtilmedi";
    String yakit ="Yakit belirtilmedi";

}
