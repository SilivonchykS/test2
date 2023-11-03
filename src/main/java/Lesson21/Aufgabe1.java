package Lesson21;

import java.util.Scanner;
import java.util.Random;

public class Aufgabe1 {
    public static String getRandomWord() {
        Random random=new Random();

        String[] words ={"Programming", "java", "method", "veriable", "integer", "number", "string"};
        int index=random.nextInt(words.length);
        return words[index];
    }
public static void printWord(char[]word, boolean[] guessLetters){
    System.out.println("Your word: ");
    for (int i=0;i< word.length;i++){
        if (guessLetters[i]){
            System.out.println(word[i]+ "  ");
        }else {
            System.out.println("_");
        }}



}
    public static void main(String[] args) {
        char[]word=getRandomWord().toCharArray();
        boolean []guessedLetters=new boolean[word.length];
        for (int i=0; i< word.length;i++){
            Scanner scanner= new Scanner(System.in);
            int attemps=7;
            while (attemps>0){
            char letter=scanner.next().toCharArray()[0];
    }

    }
  // public static boolean checkLetters (char[]word, boolean []guessLetters,char[] letter){
      //  boolean found=false;
     //   for (int i=0; i< word.length;i++){
        //    if (letter==word[i]){
           //     guessLetters[i]=true;
            //    found =true;
        //   }
      //  }
      //  return true;
  //  }
  //  public static boolean alllettersGuessed(boolean[]guessLetters){
       // for (int i00;i<guessLetters.length;i++){
           // if (!guessLetters[i]){
              //  return false;
            }
        }
   // }
//}
