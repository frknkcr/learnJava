package ders23_arrayList_forEachLoop;

public class ToyotaRunner {
    public static void main(String[] args) {

        Toyota toyota1 = new Toyota();

        System.out.println(toyota1.marka+", "
                            +toyota1.model+", "
                            +toyota1.yil+", "
                            +toyota1.km+", "
                            +toyota1.renk+", ");

        toyota1.model = "Corolla";
        toyota1.yil= 2020;
        toyota1.km = 50000;

        System.out.println(toyota1.marka+", "
                +toyota1.model+", "
                +toyota1.yil+", "
                +toyota1.km+", "
                +toyota1.renk+", ");
    }
}
