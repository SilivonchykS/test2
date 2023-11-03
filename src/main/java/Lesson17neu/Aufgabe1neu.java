package Lesson17neu;

public class Aufgabe1neu {
    //Посчитать сумму 2, 3, 4 чисел//
    public static int sum(int number1, int number2){
        return number1+number2;
    }
    public static int sum(int number1, int number2, int number3){
        return number1+number2+number3;
    }
    public static int sum(int number1, int number2, int number3, int number4){
        return number1+number2+number3+number4;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,6));
        System.out.println(sum(1,6,8));
        System.out.println(sum(7,6,11,2));
    }

}
