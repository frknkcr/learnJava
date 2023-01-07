package ders28_StringBuilder;

import ders29_inheritance.APersonel;

public class FChildOfPersonel extends APersonel {
    public static void main(String[] args) {

        FChildOfPersonel obj1 = new FChildOfPersonel();
        System.out.println(obj1.isim);
        // obj1.privateMethod();
        // child class olsa da parent class'daki private methoda ulasamaz

    }
}
