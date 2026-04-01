public abstract class  Shape {
    private String color;
    Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(){
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public void displayInfo() {
        System.out.printf("%s Color: %s, Area: %.2f, Perimeter: %.2f%n",
                getClass().getSimpleName(), color, getArea(), getPerimeter());
    }
}
