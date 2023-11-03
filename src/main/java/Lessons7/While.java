package Lessons7;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl");
        int i= scanner.nextInt();
        while (i<=1000)   {
            System.out.println(i);
            i++;
        }

    }
}
