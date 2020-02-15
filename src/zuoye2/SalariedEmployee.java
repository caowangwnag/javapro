package zuoye2;

public class  SalariedEmployee extends ColaEmployee {
    private int salary;
    public SalariedEmployee(){

    }
    public SalariedEmployee(String name,int month,int salary){
        super(name,month);
        this.salary = salary;
    }
    @Override
    public double getSalary(int month) {
        return salary;
    }
}
