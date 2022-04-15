public abstract class Shape {
   private String color;

    public Shape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }
   abstract public double getArea();
}
