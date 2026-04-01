public class InsufficientFundsException extends Exception {
    private double shortfall;

    public InsufficientFundsException(double shortfall) {
        super(String.format("Insufficient funds. You are short by $%.2f", shortfall));
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}