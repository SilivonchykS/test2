package lessons5;

import java.util.Scanner;
 public class Aufgabe6 {
        public static void main (String[] args) {
            System.out.println("Стоп, это проверка на наличие самовлюбленных цифр! ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите вот это ваше трехзначное число: ");
            String one = scanner.nextLine();
            System.out.print("И еще введите любую степень: ");
            int n = scanner.nextInt();
            String first = one.substring(0, 1);
            System.out.println("1: " + first);
            String second = one.substring(1, 2);
            System.out.println("2: " + second);
            String third = one.substring(2, 3);
            System.out.println("3: " + third);
            int ein = Integer.parseInt(first);
            int zwei = Integer.parseInt(second);
            int drei = Integer.parseInt(third);
            int sumOfThree = ((zwei*10) + (ein*100) + drei);
            System.out.println("Ваше число: " + one);
            int ourN1 = ((ein * n)*100);
            int ourN2 = ((zwei * n)*10);
            int ourN3 = ((drei * n)+ourN1 + ourN2);
            System.out.println("После магии: " + ourN3);
            System.out.println("Если они совпадают - они самовлюбились из-за степени: " );
            if (ourN3 == sumOfThree) {
                System.out.println("Самовлюбленные цифры!");
            }
            else {
                System.out.println("Они не самовлюбленные.");
            }
        }
    }
