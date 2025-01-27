package vehiclerentalsystem;

// Truck class
public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 500; // Additional fixed cost for trucks
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2; // Insurance cost = 20% of daily rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + ", Coverage: Comprehensive.";
    }
}
