public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        System.out.println("Balance: " + account.getBalance());

        double[] withdrawals = {200, 400, 100};

        for (double amount : withdrawals) {
            try {
                account.withdraw(amount);
                System.out.printf("Withdrew $%.2f. Remaining balance: $%.2f%n",
                        amount, account.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}