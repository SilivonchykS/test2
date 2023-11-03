package Homew3neukurs;
import java.util.Scanner;

public class Haufgabe1 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Input amount öf elements:");
        int amount = scanner.nextInt();
        int[] arr = new int[amount];
        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                arr[i] = i;
                continue;
            }
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr [i] + (i == arr.length - 1 ? "" : ","));
    }}}
