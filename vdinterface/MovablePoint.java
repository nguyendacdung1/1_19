package vdinterface;

public class MovablePoint implements Movable{
    public int x,y;

    public MovablePoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
    @Override
    public void moveUp(){
        x++;
        y++;
    }
    @Override
    public void moveDown(){
        x--;
        y--;
    }
    @Override
    public void moveLeft(){
        x++;
        y--;
    }
    @Override
    public void moveRight(){
        x--;
        y++;
    }
}
