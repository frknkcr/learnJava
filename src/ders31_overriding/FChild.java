package ders31_overriding;

public class FChild extends EParent{
    @Override
    protected void method1() {
        super.method1();
        // eger overriding method ile birlikte overridden method da calissin istersek
        // overriding method icinden super.method1(); yazabiliriz
    }

    @Override 
    protected void method2() {
        super.method2();
    }

    public void method3(){
        System.out.println("Child method3");
        // Parent class'da ayni isimde method olmasina ragmen override gorunmedi
        // sebep: parent'daki method3 privte access modifer'a sahip oldugundan
        // onu ayri bir method olarak gorur, override olarak gormez
    }
}
