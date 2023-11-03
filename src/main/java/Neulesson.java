import java.util.Scanner;

public class Neulesson {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        if (number>0){
            int[] arr = new  int[number];
            for (int i=0; i<arr.length;i++){
                arr[i]= i*i;
                System.out.println(arr[i]+(i==arr.length-1?"":","));
            }
        }
    }
}
