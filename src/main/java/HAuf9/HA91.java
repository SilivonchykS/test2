package HAuf9;
import java.util.Scanner;
public class   HA91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Zahl ein");
        int number = scanner.nextInt();
        int[] numbers = {5, 15, 25, 35, 45, 55, 65, 75, 76, 85, 86, 95};
        boolean suchNumber = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==number) {
                suchNumber = true;
                break;
            }}
        if (suchNumber)
                System.out.println("Richtige Zahl" );
            else
                System.out.println("Geben Sie andere Zahl ein" );
            }
        }


