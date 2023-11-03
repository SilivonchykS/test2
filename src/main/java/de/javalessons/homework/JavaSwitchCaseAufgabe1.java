package de.javalessons.homework;

public class JavaSwitchCaseAufgabe1 {
    public static void main(String[] args) {

        int day=30;
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Montag";
                break;
            case 2:
                dayOfWeek = "Dienstag";
                break;
            case 3:
                dayOfWeek = "Mittwoch";
                break;
            case 4:
                dayOfWeek = "Donnestag";
                break;
            case 5:
                dayOfWeek = "Freitag";
                break;
            case 6:
                dayOfWeek = "Samstag";
                break;
            case 7:
                dayOfWeek = "Sonntag";
                break;
            default:
                dayOfWeek = "Error!!!";
        }
        System.out.println(dayOfWeek);
    }
}
