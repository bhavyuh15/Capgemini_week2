package ecommerceplatform;

// Interface Taxable for products that have applicable taxes
public interface Taxable {
    double calculateTax(); // Method to calculate tax
    String getTaxDetails(); // Method to provide tax details
}
