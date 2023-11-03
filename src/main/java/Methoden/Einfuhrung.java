package Methoden;

public class Einfuhrung {
    public static void main(String[] args) {
        System.out.println("In main()");
        m1();
        System.out.println("Wieder in main()");
    }
    public static void m1(){
        System.out.println("In m1()");
        int ergebnis = m2 (7,12);
        System.out.println("Ergebnis:" + ergebnis);
    }
    public static int m2 (int a, int b) {
        System.out.println("In m2()");
        if (a > b)
            return a * b;
     else
         return a+2*b;
    }}


