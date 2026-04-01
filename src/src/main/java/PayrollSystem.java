public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] staff = {
                new FullTimeEmployee("employee1", "1", 60000),
                new FullTimeEmployee("employee2", "2", -5000),
                new PartTimeEmployee("employee3", "3", 25, 80),
                new PartTimeEmployee("employee4", "4", -10, 40),
                new CommissionEmployee("employee5", "5", 2000, 10000, 0.1),
                new CommissionEmployee("employee6", "6", 2000, 5000, 1.5)
        };

        double totalPayout = 0;

        System.out.println("---Monthly Payroll Processing---");

        for (Employee emp : staff) {
            double monthlySalary = emp.printPaySlip();
            totalPayout += monthlySalary;
        }
        System.out.printf("Total Monthly Payout: $%.2f%n", totalPayout);
    }
}