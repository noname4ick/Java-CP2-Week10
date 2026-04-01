public class Circle extends Shape{
    private double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
}
