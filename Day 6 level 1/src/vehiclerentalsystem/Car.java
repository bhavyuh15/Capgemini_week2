package vehiclerentalsystem;

// Car class
public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // Private insurance details

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Simple rental cost = daily rate * days
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // Insurance cost = 10% of daily rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + ", Coverage: Full.";
    }
}
