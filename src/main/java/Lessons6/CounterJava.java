package Lessons6;
import java.util.Scanner;
public class CounterJava {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Geben Sie bitte Wort ein:");
    String wortString = scanner.next().toLowerCase();
    int counter = 0;
    for (int i = 0; i< wortString.length();i++) {
        char checkBuchstabe = wortString.charAt(i);
        if (checkBuchstabe =='a') {
            counter++;
            System.out.println("Buchstabe war gerechnet: " +  counter);

        }}}

}
