package ders13_nestedForLoop_methodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {

        String str = "Java muhtesemdir";

        // metni buyuk harfe cevirin

        String buyukStr = str.toUpperCase();

        System.out.println(str);

        System.out.println(buyukStr);

        // metnin buyuk harflere cevrilmis hali S icerir mi ?

        System.out.println(buyukStr.contains("S"));

    }
}
