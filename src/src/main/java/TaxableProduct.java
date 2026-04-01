public class TaxableProduct extends Product implements Taxable {
    public TaxableProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return price * TAX_RATE;
    }

    @Override
    public void print() {
        double tax = calculateTax();
        System.out.printf("Taxable Product: %s | Price: $%.2f | Tax: $%.2f | Total: $%.2f%n",
                name, price, tax, (price + tax));
    }
}