package ders29_inheritance;

public class BDoktor extends APersonel {

    /*
     Olusturdugumuz doktor class'ında isim soyisim gibi
     personel class'ında olusturulan tum ozelliklerin olmasini istiyoruz
     bu durumda iki tercih var
        1- istenen tum ozellikleri doktor class'ında yeniden olusturabilirsiniz
        2- Doktor class'ını personelin child'ı yapmak

     Doktor class'ını personel class'ının child'i yaptigimişzda
     doktor class'ından olusturulan objeler
     sadece kendi class'larındaki ozelliklere sahip olmaz
     aynı zamanda parrent class'i olan personeldeki
     ozelliklere de sahip olurlar

     Bir child class'dan obje olusturdugumuzda
     o objenin ozelliklerini belirlerken
     once kendi class'ına bakilir ve o ozellik varsa kullanilir
     eger kendi class'inde yoksa parrent class'a bakilir

     Bir class extends keyword kullanarak baska bir class'ı kendisine parent edinirse
     1- parent class'daki tum ozellikleri kullanabilir
        (isim,soyisim,telefon,ozelsigorta)
     2- isterse parent class'da olan bir ozelligi kendisine uyarlayabilir
        (maas)
     3- isterse parent class'da olmayan kendisine ozel yeni ozellikler olusturabilir
        (nobet)
    */

    public static void main(String[] args) {

        BDoktor dok1 = new BDoktor();
        dok1.isim = "Kemal";
        dok1.soyIsim = "Bulut";

        System.out.println(dok1.isim+","+dok1.soyIsim+","+dok1.telefon);
        // Kemal,Bulut,Telefon atanmadi
        dok1.maas(); // Doktor maasi 30 * 8 * 25 : 6000
        dok1.ozelSigorta(); // Tum personelin ozel saglik sigortasi yapilir
        dok1.nobet(); // Doktorlar haftada 1 gun nobet tutar

    }
    public void maas(){
        System.out.println("Doktor maasi 30 * 8 * 25 : " + 6000);
    }
    public void nobet(){
        System.out.println("Doktorlar haftada 1 gun nobet tutar");
    }
}
