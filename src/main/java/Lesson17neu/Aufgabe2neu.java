package Lesson17neu;

public class Aufgabe2neu {
    //сделать метод, в котором печатает целочисленный массив в строчку, а строковый массив в столбик//
    public static void print(int[]arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void print(String[]arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[]arr1={4,9,1,2,0,33};
        String[]arr2={"Яблоко", "Персик", "Банан","Апельсин", "Виноград","Лимон","Помело"};
        print(arr1);
        System.out.println();
        print(arr2);
    }
}
