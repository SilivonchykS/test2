package HAufgabe7;

import java.util.Scanner;

public class HA73 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     System.out.println("Geben Sie Zahl ein");
     int zahl = scanner.nextInt();
     int sum = 0;
     int zifferZahl = 0;
     double ergebnis = 0;
     while (zahl != 0){
         zahl = scanner.nextInt();
         sum = sum + zahl;
         zifferZahl ++;
     }
     if (zifferZahl==0){
         System.err.println("Sie gabst kein Zahl ein");
     }
     else {
         ergebnis = (double) sum/ zifferZahl;
         System.out.println("Durschnitlich Zahl:" + ergebnis);
     }}}







