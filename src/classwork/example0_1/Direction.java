package classwork.example0_1;

public enum Direction {
    DOWN("down"),
    UP("up"),
    LEFT("left"),
    RIGHT("right");

    private String name;
    private Direction(String name){
        this.name=name;


    }
    public String getName(){
        return name;
    }



}
