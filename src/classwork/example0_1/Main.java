package classwork.example0_1;

public class Main {
    public static void printPosition(Position position){
        System.out.println(position.getX() + ";" + position.getY());
    }
    public static void main(String[] args) {
       Position pos=new Position();
        printPosition(pos);

        pos.move(10, Direction.RIGHT);
        printPosition(pos);
        Direction direction=Direction.DOWN;
        pos.move(4,direction);
        printPosition(pos);


    }
}
