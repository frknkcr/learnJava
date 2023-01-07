package ders29_inheritance;

public class APersonel {

    protected String isim = "Isim atanmadi";
    protected String soyIsim = "Isim atanmadi";
    protected String telefon = "Telefon atanmadi";

    protected void maas(){
        System.out.println("Hastenemizde uygulanan asgari ucret : "+ 1700);
    }
    protected void ozelSigorta(){
        System.out.println("Tum personelin ozel saglik sigortasi yapilir");
    }

    private void privateMethod(){
        System.out.println("private method calisti");
    }

}
