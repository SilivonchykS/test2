package Ytube;

public class Paaring {
    public static void main(String[] args) {
        int[] arrey={1, 3, 15, 24, 25, 34, 36, 37, 44, 45};
        int countPaarig=0;
        int countUngerade=0;
        for (int i =0;i<arrey.length;i++){
            int num= arrey[i];
            boolean check= num%2==0;
            if (check==true) {
                countPaarig++;
                System.out.println(countPaarig);
            }else {
                countUngerade++;
                    System.out.println(countUngerade);
                }
            }
        System.out.println("Количество четных" + countPaarig);
        System.out.println("Количество нечетных" + countUngerade);
        }
    }

