package classwork;

public class Main {
    public static void main(String[] args) {

    double[]arr={4,2,7,1,-5,6};
    MyArray myArray=new MyArray(arr);
    myArray.set(3,10);
    for(int i=0;i<myArray.size();i++){
        System.out.print(myArray.get(i)+ "  ");

    }
}}
