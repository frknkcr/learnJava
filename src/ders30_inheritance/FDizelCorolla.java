package ders30_inheritance;

public class FDizelCorolla extends ECorolla{

    String motor ="1.6 Dİzel motor";
    String yakit ="Dizel";
    String guvenlik ="Abs";
    String renk ="Renk belirtilmedi";


    public static void main(String[] args) {

        DToyota c3 = new FDizelCorolla();

        System.out.println(c3.motor); // DToyota // Motor belirtilmedi
        System.out.println(c3.yakit); // DToyota // Yakit belirtilmedi
        // System.out.println(c3.guvenlik); // CTE
        // System.out.println(c3.renk); // CTE

        System.out.println(c3.model); // DToyota // Model belirtilmedi
        // System.out.println(c3.uretimYeri); // CTE
        // System.out.println(c3.teker); // CTE
        // System.out.println(c3.vites); // CTE

        System.out.println(c3.marka); // DToyota // Toyota


        // Bazen child class'dan obje olusturmakla beraber
        // bu child class'in parent class'indaki hangi ozellikleri
        // aldigini bilmek isteriz
        // Bu durumda data turunu contructor'ı kullanilan class'in
        // parent class'larindan secebiliriz

        ECorolla c2 = new FDizelCorolla();

        System.out.println(c2.motor); // DToyota // Motor belirtilmedi
        System.out.println(c2.yakit); // DToyota // Yakit belirtilmedi
        // System.out.println(c2.guvenlik); // CTE
        // System.out.println(c2.renk); // CTE

        System.out.println(c2.model); // ECorolla // Corolla
        System.out.println(c2.uretimYeri); // ECOrolla // Turkiye
        System.out.println(c2.teker); // ECorolla // 205.55 teker
        System.out.println(c2.vites); // ECorolla // Vites belirtilmedi

        System.out.println(c2.marka); // DToyota // Toyota


        FDizelCorolla c1 = new FDizelCorolla();

        System.out.println(c1.motor); // FDizelCOrolla // 1.6 Dİzel motor
        System.out.println(c1.yakit); // FDizelCorolla // Dizel
        System.out.println(c1.guvenlik); // FDizelCOrolla // Abs
        System.out.println(c1.renk); // FDizelCorolla // Renk belirtilmedi

        System.out.println(c1.model); // ECorolla // Corolla
        System.out.println(c1.uretimYeri); // ECOrolla // Turkiye
        System.out.println(c1.teker); // ECorolla // 205.55 teker
        System.out.println(c1.vites); // ECorolla // Vites belirtilmedi

        System.out.println(c1.marka); // DToyota // Toyota



    }

}
