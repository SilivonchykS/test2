package homework3;

public class HAufgabe5 {
    public static void main(String[] args) {
        int age =58 ;
        if(age <= 12) {
            System.out.println("Kind");
        } else {
            if (age>=13 && age <=18) {
                System.out.println("Teenager");
            } else {
                if (age>=19 && age <=59) {
                    System.out.println("Erwachsene");
                } else {
                    if (age >= 60) {
                        System.out.println("Alten");
                    }
                }
            }
        }
    }
}
