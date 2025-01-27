package ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

// Main controller class for the e-commerce platform
public class ECommercePlatformController {
    public static void main(String[] args) {
        // Creating a list to store different products
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E001", "Smartphone", 5000)); // Adding an Electronics product
        products.add(new Clothing("C001", "T-Shirt", 1000)); // Adding a Clothing product
        products.add(new Groceries("G001", "Rice Bag", 500)); // Adding a Groceries product

        // Loop through each product and calculate the final price
        for (Product product : products) {
            double price = product.getPrice(); // Get the base price
            double discount = product.calculateDiscount(); // Calculate the discount
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0; // Calculate tax if applicable
            double finalPrice = price + tax - discount; // Calculate the final price

            // Print product details
            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: $" + price);
            System.out.println("Discount: $" + discount);
            System.out.println("Tax: $" + tax);
            System.out.println("Final Price: $" + finalPrice);

            // Print tax details if the product is taxable
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }


        }
    }
}
