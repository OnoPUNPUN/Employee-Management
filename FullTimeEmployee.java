public class FullTimeEmployee extends Employee {
    private double bonus;

    FullTimeEmployee(int empId, double salary, double bonus)
    {
        super(empId, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus)
    {
        if(bonus > 0)
        {
            this.bonus = bonus;
        } else {
            System.out.println("Invaild Bonus.");
        }
    }

    public double getBonus(){return bonus;}

    @Override
    public void displayBenefits() {
        System.out.println("Full-Time Benifits: Salary + Bonus = " + (getSalary() + bonus));
    }

    
}