package classwork.xample01;
import classwork.xample01.ork.Pleuer;

public class Ain {
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
