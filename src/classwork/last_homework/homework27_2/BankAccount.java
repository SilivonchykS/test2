package classwork.last_homework.homework27_2;

public class BankAccount {
    private String number;
    private double money;
    public BankAccount(String number){
        this.number=number;
        this.money=0;
    }
    public String getNumber(){
        return number;
    }
    public double getMoney(){
        return money;
    }
    public void deposit(double ammount){
        money+=ammount;
    }
    public void withdraw(double ammount){
        if (money>= ammount) {
            money -= ammount;
        }else {
            System.out.println("Insufficient funds");
        }
    }
}
