package lessons5;

    import java.util.Scanner;
    public class Aufgabe3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Geben Sie die Zahl ein");
            int one = scanner.nextInt();
            System.out.print("Geben Sie die Zahl ein, durch die dividieren werden soll");
            int two = scanner.nextInt();
            if (one == 0) {
                System.out.println("kann nicht durch Null dividieren");
            }
            else if (((one % two) %2 == 0)) {
                System.out.println("ohne Rest");
            } else {
                System.out.println("ungültige Daten, es besteht ein Rest");
            }
        }
    }

























