public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method to test the class
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("John Doe", "Toyota Camry", 5, 40.0);
        rental1.displayRentalDetails();  // Display rental details
    }
}
