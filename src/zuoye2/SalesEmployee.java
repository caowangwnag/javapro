package zuoye2;

public class SalesEmployee extends ColaEmployee {
    private int monthsalary;
    private double tichenglu;
    public SalesEmployee(){

    }
    public SalesEmployee(String name,int month,int monthsalary,double tichenglu){
        super(name,month);
        this.monthsalary = monthsalary;
        this.tichenglu = tichenglu;
    }
    @Override
    public double getSalary(int month) {
        double salary = monthsalary*tichenglu;
        return salary;
    }
}
