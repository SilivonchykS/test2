package HAufgabe7;
import java.util.Scanner;
public class HA71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Zahl ein");
        int zahl = scanner.nextInt();
            int minzif = 9;
            int maxzif = 0;
            while (zahl > 0) {
                int ziffer = zahl%10;
                System.out.println("ziffer=" + ziffer);
                if (ziffer < minzif) {
                    minzif = ziffer;
                }
                if (ziffer > maxzif) {
                    maxzif = ziffer;
                }
                zahl = zahl / 10;
                System.out.println(" Zahl:" + zahl);
                System.out.println("-------*----------");
            }
            System.out.println("Max" + "  " + maxzif +  "  " + "Min" + "  " + minzif);

        }
    }