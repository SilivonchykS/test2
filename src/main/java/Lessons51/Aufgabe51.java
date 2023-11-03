package Lessons51;

public class Aufgabe51 {
    public static void main(String[] args) {
        int namberInt = 120;
        String name = "Mustermann";
       // System.out.println( namberInt + " " + name);
        //System.out.printf( "%s %d",  name, namberInt);
        double numberDouble= 1.0125836;
        boolean resoultBoolean = true;
      //  System.out.printf("Double: %.3f Boolean: %b", numberDouble , resoultBoolean);

       // String text = "Group 33 besteht aus 38 Studenten";
       // int langhtTest = text.length();
       // System.out.println("Textlange"+langhtTest);

        String text = "Hallo zusammen";
        int lenghtText = text.length();
        System.out.println("text" + lenghtText);

        char buchstabe = text.charAt(10);
        System.out.println("Erste Buchstabe" + buchstabe);
        String upperCaseString = text.toUpperCase();
        System.out.println(upperCaseString);
    }
}
