package HAufgabe6;
import java.util.Scanner;
public class HA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein Zahl ein: ");
        //int zahl = scanner.nextInt();
       // String strZahl= String.valueOf(zahl);
       // int leight= strZahl.length();
       // int reverse = 0;
              //  for (int i=0; i < leight; i++) {
           // int ziffer = zahl % 10;
          //  reverse= reverse*10+ziffer;
           // zahl= zahl/10;
      //  }
            //System.out.println("Reversed:" + reverse);
       // Число в обратном порядке
        String numberString= scanner.nextLine();
        int lengthOfNummer = numberString.length();
        System.out.print("Reverse number:");
        for (int i=lengthOfNummer-1; i>=0; i--){
            System.out.println(numberString.charAt(i));;
        }
        }}



