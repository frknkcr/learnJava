package ders13_nestedForLoop_methodOlusturma;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersten yazdirin

        String input = "Java ne kadar guzel";

        for (int i = input.length()-1; i >= 0 ; i--) {

            System.out.println(input.charAt(i));
        }

    }
}
