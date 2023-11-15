package classwork.example01;

public class Main {
    public static void main(String[] args) {
        classwork.example01.work.Pleuer pleuer=new classwork.example01.work.Pleuer("Janet", "Meneger", 4000);
        System.out.println(pleuer.getName()+",works 88"+ pleuer.getPosition()+",gets"
                +pleuer.getSalary()+"  per month;");
        System.out.println("Time for raise!");
        pleuer.setSalary(5500);
        pleuer.setPosition("lead Manager");
        System.out.println(pleuer.getName()+", works es"+pleuer.getPosition()+",gets"
                +pleuer.getSalary()+"  per month");
    }
}
