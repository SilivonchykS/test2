package Lesson17neu;

public class Aufgabe4neu {
    //написать метод, который считает целую степень числа
    public static double power(double base, int pow){
        if (pow==0){
            return 1;
        }
        if (pow<0){
            base=1.0/base;
            pow*=-1;
        }
        double res=1;
        for (int i=0;i<pow;i++){
            res*=base;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(2,-3));
    }
}
