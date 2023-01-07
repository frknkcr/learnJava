package ders08_ternary_switch;

public class C06_SwitchCase {
    public static void main(String[] args) {

        // kullanicinin girdigi gun numarasinin
        // gun ismini yazdirin

        int gunNo=4;
        if (gunNo==1){
            System.out.println("pazartesi");
        } else if (gunNo==2) {
            System.out.println("salı");
        } else if (gunNo==3) {
            System.out.println("çarşamba");
        } else if (gunNo==4) {
            System.out.println("perşembe");
        } else if (gunNo==5) {
            System.out.println("cuma");
        } else if (gunNo==6) {
            System.out.println("cumartesi");
        } else if (gunNo==7) {
            System.out.println("pazar");
        } else{
            System.out.println("hatalı giriş");
        }

        switch (gunNo){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("geçersiz giriş");
        }

    }
}
