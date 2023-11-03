package HAuf9;

public class HA93 {
    public static void main(String[] args) {
        int[] iArray = {3, 12, 5, 25, 16, 2};
        boolean vergArray = false;
        for (int i = 0; i < iArray.length - 1; i++) {
            if (iArray[i] >= iArray[i + 1]) {
            } else {
                vergArray = true;
                break;
            }
        }
        if (vergArray)
            System.out.println("Wachsendes Array");

                System.out.println("ERROR");
                }
    }

