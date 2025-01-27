package ecommerceplatform;

// Clothing class representing clothing items
public class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount on clothing
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax on clothing
    }

    @Override
    public String getTaxDetails() {
        return "5% GST applied on Clothing.";
    }
}
