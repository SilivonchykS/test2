package ClassworkMassiv;

public class Aufgabe1 {
    /*написать метод который добавитт один элемент в конец массива

     */
    public static void add(int[]arr, int value) {
        //временный массив чтобы добавить новый элемент
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
            temp[arr.length] = value;
      //      return temp;
        }


    public static void printArr(int[]arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "  ");
            }

        }
    public static void main(String[] args) {
        int[]arr= {1,3,5,7,9};
        printArr(arr);
        System.out.println();
      //  arr =add(arr,11);
        printArr(arr);
    }}
