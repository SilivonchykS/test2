package classwork;

public class Main {
    public static int cookTime(int eggs){
        return ((eggs/8)+1)*5;
    }
    public static void main(String[] args) {
        double[] arr={4,2,7,1,-5,6};
        MyArray myArray=new MyArray(arr);

        myArray.set(myArray.indexOf(1),10);
        //for (int i=0;i<myArray.size();i++){
        myArray.add(myArray.indexOf(7),123);
        System.out.print(myArray);

    }
}
