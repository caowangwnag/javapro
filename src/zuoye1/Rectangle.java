package zuoye1;

public class Rectangle extends Shape {
    public Rectangle(){

    }
    public Rectangle(int height,int width,String color){
        super(color);
        this.height = height;
        this.width = width;
    }
    private int height;
    private int width;

    @Override
    public int getArea() {
         int area = height*width;
         return area;
    }

    @Override
    public int  getPer() {
        int pre = 2*(height+width);
        return pre;
    }

    @Override
    public void showAll() {
        System.out.println("长:"+width);
        System.out.println("宽:"+height);
        System.out.println("面积:"+getArea());
        System.out.println("周长:"+getPer());
        System.out.println("颜色:"+getColor());
    }
}
