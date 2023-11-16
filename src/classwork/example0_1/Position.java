package classwork.example0_1;

public class Position {
    private double x;
    private double y;
    public Position(){
        x=0;
        y=0;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public void move(double distance, Direction direction){
        switch (direction){
            case UP:
                y+=distance;
                break;
            case DOWN:
                y-=distance;
                break;
            case LEFT:
                x-=distance;
                break;
            case RIGHT:
                x+=distance;
                break;
        }
    }

}
