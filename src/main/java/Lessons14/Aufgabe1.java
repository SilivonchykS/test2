package Lessons14;
import java.util.ArrayList;
public class Aufgabe1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banan");
        fruits.add("Sweet Cherry");
        fruits.add("Melon");
        fruits.add("Blackberry");
        {
            System.out.print("ArrayFruits contains the next elements" + fruits );
            System.out.println();
        }
        fruits.remove(3); // Удаление третьего элемента
        fruits.set(2, "Cherry"); // Замена второго элемента
        {
            System.out.print("ArrayFruits  contains the next elements after change" + fruits);
    }
}}
