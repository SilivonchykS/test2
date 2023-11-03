package Lesson17neu;

public class Aufgabe3neu {
    //На вход подается целочисленный массив, в котором записаны только цифры
    //Обьеденить этот массив в одно число
           // Ввод:4,8,1,2,3
    //Результат 48123

    public static int concat(int[]arr) {
        int res = 0;
        for (int i = 0, j = arr.length; i < arr.length; i++, j--) {
            res += arr[i] * Math.pow(10, j);

        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={4,8,1,2,3};
        System.out.println(concat(arr));

    }
}
