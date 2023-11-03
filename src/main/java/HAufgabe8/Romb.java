package HAufgabe8;

import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту половину высоты ромба: ");
        int numberHeight = scanner.nextInt();

        for (int i = 0; i < numberHeight; i++) {
            for (int y = 0; y < numberHeight - i - 1; y++) {
                System.out.print(" ");
            }
            for (int s = 0; s < 2 * i+1 ; s++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < numberHeight; i++) {
            for (int y = 0; y <= i-1; y++) {
                System.out.print(" ");
            }
            for (int s = 2*numberHeight -2 * i-1; s > 0; s--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

