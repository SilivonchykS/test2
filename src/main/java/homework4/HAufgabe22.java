package homework4;
import java.util.Scanner;
public class HAufgabe22 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Wort");
        String greet = scanner.next();
        String antwort = scanner.next();
        switch (greet){
            case "Hallo" -> antwort = "Hallo";
            case "Adieu" -> antwort = "Adieu";
            default -> System.err.println("answer");



        }
    }
}
