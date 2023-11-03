package lessons5;

public class Aufgabe1 {
        public static void main(String[] args) {
            String mon = "Monday";
            String tue = "Tuesday";
            String wed = "Wednesday";
            String thu = "Thursday";
            String fr = "Friday";
            String sat = "Saturday";
            String sun = "Sunday";
            String hader = "%-10s %10s %10s %10s %10s %10s %10s %n";
            String space = "----------------------------------------------------------------";
            System.out.println(" ");
            System.out.printf(hader, mon, tue, wed, thu, fr, sat, sun);
            System.out.println(space);
            System.out.printf(hader, "","","","","", "1", "2");
            System.out.printf(hader, "3", "4", "5", "6", "7", "8", "9");
            System.out.printf(hader, "10", "11", "12", "13", "14", "15", "16");
            System.out.printf(hader, "17", "18", "19", "20", "21", "22", "23");
            System.out.printf(hader, "24", "25", "26", "27", "28", "29", "30");
            System.out.printf(hader, "31", "","","","","","");
            System.out.println(space);
            System.out.println(" ");
        }
    }

