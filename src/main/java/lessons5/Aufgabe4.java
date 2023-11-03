package lessons5;

import java.util.Scanner;

public class Aufgabe4 {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Geben Sie die erste Zahl ein: ");
            int one = scanner.nextInt();
            System.out.print("Geben Sie die zweite Zahl ein: ");
            int two = scanner.nextInt();
            System.out.print("Geben Sie die dritte Zahl ein: ");
            int three = scanner.nextInt();
            if (three>two && two>one) {
                System.out.println("Цифры упорядочены в возрастающем порядке");
            } else if (one>two && two>three) {
                System.out.println("Цифры упорядочены в убывающем порядке");
            }
            else {
                System.out.println("zufällige Reihenfolge der Zahlen");
            }
        }
    }
