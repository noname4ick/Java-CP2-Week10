public class StoreDemo {
    public static void main(String[] args) {
        Printable[] inventory = {
                new Product("Coffee Mug", 10.00),
                new TaxableProduct("Leather Jacket", 150.00),
                new DigitalProduct("Java E-Book", 45.00, "http://store.com/java-book"),
                new Product("Notebook", 5.00),
                new TaxableProduct("Smartphone", 800.00)
        };

        double totalTax = 0;

        System.out.println("--- Store Inventory ---");
        for (Printable item : inventory) {
            item.print();

            if (item instanceof Taxable) {
                Taxable taxableItem = (Taxable) item;
                totalTax += taxableItem.calculateTax();
            }
        }

        System.out.println("-----------------------");
        System.out.printf("Total Tax Collected: $%.2f%n", totalTax);
    }
}