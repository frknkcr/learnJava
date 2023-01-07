package ders04_matematikselİslemler_incrementDecrement;

public class C08_Pre_Post_Increment {
    public static void main(String[] args) {

        int x = 3;       // x=4
        int y = 2 * ++x; // y=7
        int z = 5 + y--; // z=13

        System.out.println(x+y+z);

    }
}
