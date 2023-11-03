package Lessons6;

public class Aufgabe1

{
    public static void main(String[] args) {


       // for (int i= 1; i<=5; i++){
           // System.out.print(i + " ");

           // for (int i= 50; i<=500; i++) {
               // System.out.print(i + " ");
//i=50-->i<52 -->Yes-->i++-->i=51
        //i=51-->i<52 -->Yes-->i++-->i=52
        //i=52-->i<52 -->Yes-->i++-->i=53
        //i=53-->i<52 -->No-->-->-->-->...
       // for (int i= 50; i<=52; i++) {
        // System.out.print(i + " ");

          //  for (int i= 50; i<=52; i++) {
           // System.out.println("Hellö!!!");

           // }
           // System.out.println("Stop");
//Все четные до 100
     //    for (int i= 1; i<=100; i++) {
       // boolean ergebnis = i%2 == 0;
        //if (ergebnis) {
          //  System.out.print(i + " ");

            //for (int i= 1; i<=100; i++) {
               // boolean ergebnis = i%2 == 0;
               // if (ergebnis) {
                  //  System.out.print(i + " ");//
// Сколько четных чисел
        int counter = 0;
        for (int i= 1; i<=100; i++) {
         boolean ergebnis = i%2 == 0;
        if (ergebnis) {
            System.out.print(i + " ");
            counter++;
        }}
        System.out.print("Counter" + counter);





    }}




