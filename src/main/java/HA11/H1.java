package HA11;

public class H1 {
    public static void main(String[] args) {
        int[]a={15, 18 ,22, 24, 25, 31, 32, 33, 36,41};
        int[]b={1, 4, 8, 11};
        int[]c=new int[a.length+b.length];
        int counter =0;
        for (int i=0; i<a.length; i++) {
            c[i] = a[i];
            counter++;
        }
        for (int j=0;j<b.length; j++){
        c[counter++] = b[j];
    }
        for (int i=0;i<c.length;i++)

            System.out.println(c[i] +" ");
        }

}

