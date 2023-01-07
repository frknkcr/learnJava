package ders04_matematikselİslemler_incrementDecrement;

public class C07_Pre_Post_Increment {
    public static void main(String[] args) {

        int a = 10;
        int b = a++;
        int c = ++b;

        System.out.println("a: "+ a + ", b: " + b + ", c: " + c);

        a = 20;
        b = ++a;
        c = a++;

        System.out.println("a: "+ a + ", b: " + b + ", c: " + c);

        a = 30;

        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);

        int x = 10;
        ++x;

        System.out.println(x);



    }
}
