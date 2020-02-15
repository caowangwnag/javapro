package zuoye1;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6,"红色");
        Circle circle = new Circle(4,"蓝色");
        System.out.println("........矩形..........");
        rectangle.showAll();
        System.out.println("........圆..........");
        circle.showAll();

    }
}
