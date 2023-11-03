package Homew3neukurs;
import java.util.Scanner;
public class HAufg2neukurs {
    public static int askAmount(){
    Scanner scanner=new Scanner(System.in);
        System.out.println ("Input amount öf elements:");
        return scanner.nextInt();
}

    public static int[] generateFibonceiSequence(int amount) {
        int[] arr = new int[amount];
        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                arr[i] = 1;
                continue;
            }
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
    public static void printArray(int[]arr){
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]+(i==arr.length-1?"":","));
        }
    }
    public static void main(String[] args) {
        int amount = askAmount();
        int[]arr=generateFibonceiSequence(amount);
        printArray(arr);
    }}




