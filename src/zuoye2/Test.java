package zuoye2;

public class Test {
    public static void main(String[] args) {

        ColaEmployee[] a = new ColaEmployee[3];
        a[0] = new SalariedEmployee("A",2,2);
        a[1] = new HourlyEmployee("B",1,10,130);
        a[2] = new SalesEmployee("C",5,300000,1.5);
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i].getSalary(i));
        }

    }
}
