package lesson3;

public class Aufgabe3 {
    public static void main(String[] args) {
        int age =46;
        String langvige = "German";
        boolean drivinglicence = true;
        if ( age >= 18 && age<= 67 && drivinglicence == true){
            System.out.println("Sie sind Bewerber");
            if (langvige.equals("China")|| langvige.equals("German") ) {
                System.out.println("Sie durfen arbeiten!!!");
            }
            else {
                System.out.println("Lernen Sie chinesisch!!!");
            }}
        else {
            System.out.println("Arbeit nicht fur Ihnen");

            }
        }


    }

