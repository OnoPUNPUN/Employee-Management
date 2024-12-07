public class PartTimeEmployee extends Employee {
    private double overTimePay;

    PartTimeEmployee(int empId, double salary, double overTimePay)
    {
        super(empId, salary);
        this.overTimePay = overTimePay;
    }

    public void setOverTimePay(double overTimePay)
    {
        if(overTimePay > 0)
        {
            this.overTimePay = overTimePay;
        } else {
            System.out.println("Invaild OverTime Pay.");
        }
    }

    public double getOverTimepay(){return overTimePay;}

    @Override
    public void displayBenefits()
    {
        System.out.println("Part-Time Benefits: Salary + Over Time = " + (getSalary() + overTimePay));
    }
}