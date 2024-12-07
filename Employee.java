abstract class Employee {
    private int empId;
    private double salary;

    public Employee(int empId, double salary)
    {
        this.empId = empId;
        this.salary = salary;
    }

    public void setEmpId(int empId)
    {
        if(empId > 0)
        {
            this.empId = empId;
        } else {
            System.out.println("Invalid Employee Id.");
        }
    }

    public int getId(){return empId;}

    public void setSalary(double salary)
    {
        if(salary > 0)
        {
            this.salary = salary;
        } else {
            System.out.println("In valid Salary Amount.");
        }
    }

    public double getSalary(){return salary;}
    
    public abstract void displayBenefits();
}
