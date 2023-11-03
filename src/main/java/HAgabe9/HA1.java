package HAgabe9;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class HA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово :");
        String wordString = scanner.next().toLowerCase();

        //"Java"

        /**for (int i=0; i < wordString.length(); i++){
         char checkLetter = wordString.charAt(i);
         if(checkLetter == 'a'){
         counter++;
         }
         }**/
        //Наган
        //System.out.println("Letter was counted: " + counter);


        int wordLenth = wordString.length();
        int letzte = wordLenth - 1;
        int mid = (wordLenth / 2);
        boolean result = true;

        for (int i = 0; i < mid; i++) {
            System.out.println(" Сравниваем " + wordString.charAt(i) + " и " + wordString.charAt(letzte));
            if (wordString.charAt(i) != wordString.charAt(letzte)) {
                result = false;
                break;
            } else {
                letzte--;
            }
        }
        if (result == true) {
            System.out.println("Слово " + wordString + " палиндром");
        } else {
            System.out.println("Слово " + wordString + " не палиндром");
        }


        /*for (int i=0;i<=wordString.length(); i++){
            char checkLetter = wordString.charAt(i);
          if (checkLetter=='a' ) {
              counter++;*/
    }


}










