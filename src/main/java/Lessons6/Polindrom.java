package Lessons6;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Wort ein: ");
    String wortString = scanner.next().toLowerCase();
        int wortlenth= wortString.length();
        int letzte = wortlenth - 1;
        int mid = (wortlenth/2);
        boolean ergebnis = true;
        for (int i=0; i< mid;i++) {
            char checkLetter = wortString.charAt(i);
            System.out.println("Сравниваем:" + wortString.charAt(i) + "и" + wortString.charAt(letzte));
            ergebnis = false;
            break;
        }}
        {
        System.out.println("Слово"  + "polindrom");

        System.out.println("Слово" + "kein polindrom");


}
}

