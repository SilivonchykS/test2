package classwork.example01.work;

public class Pleuer {
    private int salary;
    private String position;
    private String name;

    public Pleuer(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

}