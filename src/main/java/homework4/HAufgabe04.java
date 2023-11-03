package homework4;
import java.util.Scanner;

public class HAufgabe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Erse Zahl");
        int zahl1 = scanner.nextInt();
        System.out.println("Zweite Zahl");
        int zahl2 = scanner.nextInt();
        System.out.println(" Operation: + , - , * , / ");
        String operator = scanner.next();
        int ergebnis = 999;
        switch (operator) {
            case "+":
                ergebnis = zahl1 + zahl2;
                break;
            case "-":
                ergebnis = zahl1 - zahl2;
                break;
            case "*":
                ergebnis = zahl1 * zahl2;
                break;
            case "/":
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                } else {
                    System.err.println("Devision 0");
                }
                break;
            default:
                System.err.println("Ungultige Operation");
        };
        System.out.println("Ergebnis:" + ergebnis);

    }
}
