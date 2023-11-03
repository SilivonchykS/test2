package HA11;

public class H2 {
    public static void main(String[] args) {
        int[] numbers = {17, 18, 22, 23, 25, 26, 31, 32, 33};
        int unGer = 0;
        int ger = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            boolean check = num % 2 == 0;
            if (check == true) {
                ger++;
            System.out.println(ger);
        }else {
                unGer++;
                System.out.println(unGer);
            }}
            System.out.println("Четные числа:" + " " + ger);
            System.out.println("Нечетные числа:" + " " + unGer);
        }
    }
