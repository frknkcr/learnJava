package ders06_IfElseStatements;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        int not = 45;

        /*
        if else statement'da {} kullanmazsak
        hem if body'si hem else body'si icin sadece 1 satir kabul eder
         */

        if (not>=50) {
            System.out.println("Sınıfı geçtin \nYazın kafan rahat");

        } else {
            System.out.println("Dersten kaldın \nYaz okuluna bekleriz :)");
        }
    }
}
