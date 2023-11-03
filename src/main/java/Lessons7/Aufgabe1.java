package Lessons7;
import java.util.Scanner;
public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein Zahl ein: ");
        int zahl = scanner.nextInt();
        while (zahl!=0){
            System.out.println("Anderes Zahl:");
            zahl = scanner.nextInt();
            System.out.println("Richtiges Zahl");
        }
    }
}
