package lesson3;

public class Visokosny4 {
    public static void main(String[] args) {
        int dayCheck = 28;
        int dayFabruary = 29;
        if (dayFabruary >= 28 && dayFabruary <= 29 && dayFabruary!= dayCheck) {
            System.out.println("Kein Schaltjahr");
        }
        else if ( dayFabruary== dayCheck) {
            System.out.println("Schaltjahr");
        } else {
            System.out.println("Fehler");
        }

    }
}
