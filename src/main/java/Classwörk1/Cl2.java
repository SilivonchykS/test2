package Classwörk1;

public class Cl2 {
    public static void printGreeting(){
        System.out.println("Hallo!");
    }
    public static void countOneToTen(){
     for (int i = 1; i <= 10; i++)    {
        System.out.print(i + " ");
    }}

    public static void main(String[] args) {
        printGreeting();
        countOneToTen();
        System.out.print("/n noch mal");
        countOneToTen();

        }
    }
