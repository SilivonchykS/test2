package classwork.Example01;
import classwork.Example01.work.Pleuer;

public class Main26 {
    public static void main(String[] args) {
        Pleuer pleuer=new Pleuer("Janet", "Meneger", 4000);
        System.out.println(pleuer.getName()+",works 88"+ pleuer.getPosition()+",gets"
                +pleuer.getSalary()+"  per month;");
        System.out.println("Time for raise!");
        pleuer.setSalary(5500);
        pleuer.setPosition("lead Manager");
        System.out.println(pleuer.getName()+", works es"+pleuer.getPosition()+",gets"
                +pleuer.getSalary()+"  per month");
    }
}
