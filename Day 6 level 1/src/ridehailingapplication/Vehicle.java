package ridehailingapplication;

// Abstract Class
// Represents a generic vehicle in the ride-hailing application
public abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    // Initializes vehicle properties
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract Method to calculate fare based on distance
    public abstract double calculateFare(double distance);

    // Concrete Method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // Encapsulation - Getter Methods
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}
