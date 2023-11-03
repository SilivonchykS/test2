package Lessons6;
import java.util.Scanner;
public class Selbst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Wort ein: ");
        String wortString = scanner.next();
        int counter = 0;
        for (int i=0; i< wortString.length();i++) {
            char checkLetter = wortString.charAt(i);
            if (checkLetter == 'a') {
counter++;
            }}
                System.out.println("Letter was counted:" + counter );


    }
}
