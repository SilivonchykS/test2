package Homew3neukurs;


import java.util.Random;
import java.util.Scanner;

public class Homework2ne {
    public static int askAmount(){
        Scanner scanner=new Scanner(System.in);
        System.out.println ("Input amount öf elements:");
        return scanner.nextInt();
    }
public static int[]getRandomArrey(int amount){
    Random random=new Random();
    int min=0;
    int max=100;
    int[]arr=new int[amount];
    for (int i=0; i<arr.length;i++){
        arr[i]=min+random.nextInt(max-min);
    }
    return arr;

}
   // public static int[]getInitialData(){
      //  int amount=askAmount();
      //  int[]arr=getRandomArrey(amount);
     //   return arr;

    }
  //  public static void printArray(int[]arr){
      //  for (int i=0; i<arr.length;i++){
      //      System.out.println(arr[i]+(i==arr.length-1?"":","));
     //   }}
  //  public static void sort(int[]arr){

   // public static void main(String[] args) {

           // for (int i = 0; i < arr.length; i++) {
             //   int index=1;
               // for (int j = 0; j < arr.length; j++) {
                  //  if (arr[index]>arr[j]){
                 //    index=j;

         //   }}
        //        if (index==i) {
         //           continue;
  //  }
               // int temp=arr[index];
               // arr[index]=arr[i];
               // arr[i]=temp;
//}}}}

  //  public static void main(String[] args) }
//int[]

