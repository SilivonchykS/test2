package lessons4;
import java.util.Scanner;

public class JavaScannerAufgabe {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Geben Sie Ihre Name an:");
        String name = scanner.nextLine();
        System.out.println("Hallo!" +  name);

    }
}
