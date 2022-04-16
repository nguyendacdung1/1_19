package train;

public class Triangle implements Shape{
    private int base,height;

    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public String toString(){
        return "Triangle [ base="+base+", height="+height+"]";
    }
    @Override
    public double getArea(){
        return 1.0f/2*base*height;
    }

}
