public class Triangle extends Shape{
    private int base,height;

    public Triangle(String color, int base, int height){
        super(color);
        this.base=base;
        this.height=height;
    }
    @Override
    public String toString(){
        return "This is a Triangle";
    }
    @Override
    public double getArea(){
        return (float)1/2*base*height; //ép kiểu float hoặc 1.0f/2
    }
}
