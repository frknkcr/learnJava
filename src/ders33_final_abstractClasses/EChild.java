package ders33_final_abstractClasses;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("parent class'daki mecburi override edilecek method1'i override ettik");
    }

    @Override
    public void method2() {
        System.out.println("parent class'daki mecburi override edilecek method2");
    }

    /*
        Klasik inheritance ile parent child iliskisi olusturdugumuzda
        Parent class'daki tum ozellikleri otomatik olarak kazaniriz
        Ancak methodlari override etme mecburiyeti yoktur
        Ister override edip kendimize ozellestiririz
        Istersek de parent class'daki haliyle kullanırız
     */

    public static void main(String[] args) {

        // DParent obj1= new DParent();
        // 'DParent' is abstract; cannot be instantiated
        // Abstract class'larin constructur'lari vardir ama OBJE URETILEMEZ

        EChild chld1 = new EChild();

        chld1.method1(); //parent class'daki mecburi override edilecek method1'i override ettik
        chld1.method2(); //parent class'daki mecburi override edilecek method2
        chld1.method3(); //parent class'daki method3 calisti

        DParent chld2 = new EChild();
        chld2.method1();
        chld2.method2();
        chld2.method3();
    }
}
