package Homew3neukurs;
import java.util.Scanner;

public class WageKerper {
    public static int askValiü(String massege){
        Scanner scanner=new Scanner(System.in);
        System.out.println(massege);
        return scanner.nextInt();
    }
    public static double convertToMeters(int cm){
        return cm/100.0;
    }
    public static double getBmi(int weight, double hight){
        return weight/(hight+hight);
    }
    public static void interpretBmi(double bmi){
        if (bmi<15){
            System.out.println("Your have anarexia!See doctor immediately!");
        }else if (bmi<20){
            System.out.println("You are underwight");
        }else if (bmi<25){
            System.out.println("You are normal weight!");
        }else if (bmi<30){
            System.out.println("You are overweight");
        }else {
            System.out.println("You have obecity!See doctor immediately!");
        }
    }

    public static void main(String[] args) {
        int weight=askValiü("Input your weight in kg");
        int height=askValiü("Input your height in cm");
        double heightM=convertToMeters(height);
        double bmi=getBmi(weight,heightM);
        System.out.println("Your BMI is:"+bmi);

    }
}
