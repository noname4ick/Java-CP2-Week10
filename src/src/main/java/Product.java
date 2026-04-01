public class Product implements Printable {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.printf("Product: %s | Price: $%.2f%n", name, price);
    }
}