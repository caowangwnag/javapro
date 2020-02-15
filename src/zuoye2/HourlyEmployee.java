package zuoye2;

public class HourlyEmployee extends ColaEmployee {
    private double hoursalary;
    private int hour;
    public HourlyEmployee(){

    }
    public HourlyEmployee(String name,int month,double hoursalary,int hour){
        super(name,month);
        this.hoursalary = hoursalary;
        this.hour = hour;
    }
    @Override
    public double getSalary(int month) {
        double salary = 0;
        if (hour<=160){
            salary = hour*hoursalary;
        }else {
            salary = 160*hoursalary+(hour-160)*1.5*hoursalary;
        }
        return salary;
    }
}
