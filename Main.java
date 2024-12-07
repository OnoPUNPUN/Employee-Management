public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, 500000, 100000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, 2000000, 50000);

        fullTimeEmployee.displayBenefits();
        partTimeEmployee.displayBenefits();
    }
}
