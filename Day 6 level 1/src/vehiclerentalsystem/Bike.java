package vehiclerentalsystem;

// Bike class
public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Simple rental cost = daily rate * days
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // Insurance cost = 5% of daily rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + ", Coverage: Limited.";
    }
}
