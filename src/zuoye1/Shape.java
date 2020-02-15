package zuoye1;

public abstract class Shape {
    public Shape(){

    }
    public Shape(String color){
        this.color = color;
    }
    private int area;
    private int per;
    private String color;
    public abstract int getArea();
    public abstract int getPer();
    public abstract void showAll();
    public String getColor(){
        return color;
    }
}
