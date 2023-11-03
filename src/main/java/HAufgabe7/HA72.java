package HAufgabe7;
import java.util.Scanner;
public class HA72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Zahl ein");
        int zahl = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i<= zahl; i++) {
            sum = sum + i;
            System.out.println(" i" + i);
            System.out.println(" sum" + sum);
        }
            System.out.println("-------*----------");
        System.out.println("Sum" + sum);
        }
}
