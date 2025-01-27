package ecommerceplatform;

// Abstract class Product representing a generic product
public abstract class Product {
    private String productId; // Unique identifier for the product
    private String name; // Name of the product
    private double price; // Price of the product

    // Constructor to initialize the product
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters for encapsulation of product details
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method for calculating product-specific discounts
    public abstract double calculateDiscount();
}
