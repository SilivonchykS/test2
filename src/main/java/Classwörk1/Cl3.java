package Classwörk1;
import java.util.Scanner;

public class Cl3 {
    public static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
    public static void salveAndPrintRoots (double a, double b, double c) {
        double d = discriminant(a, b, c);
        double x1 = (-b + Math.sqrt(d));
    }
        Scanner scanner=new Scanner(System.in);
        double a = scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();
    }
