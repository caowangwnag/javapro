package zuoye1;

public class Circle extends Shape {
    public Circle(){

    }
    public Circle(int ridaus,String color){
        super(color);
        this.ridaus = ridaus;
    }
    private int ridaus;

    @Override
    public int getArea() {
        int area = 3*ridaus*ridaus;
        return area;
    }

    @Override
    public int getPer() {
        int per = 2*3*ridaus;
        return per;
    }

    @Override
    public void showAll() {
        System.out.println("半径:"+ridaus);
        System.out.println("面积:"+getArea());
        System.out.println("周长:"+getPer());
        System.out.println("颜色:"+getColor());
    }

}
