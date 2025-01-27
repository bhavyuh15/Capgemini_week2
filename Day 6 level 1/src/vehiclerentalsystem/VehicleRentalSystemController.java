package vehiclerentalsystem;


import java.util.ArrayList;
import java.util.List;

// Main Controller
public class VehicleRentalSystemController {
    public static void main(String[] args) {
        // List to store different vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 2000, "CARINS001")); // Car with rental rate and insurance
        vehicles.add(new Bike("BIKE123", 500, "BIKEINS002")); // Bike with rental rate and insurance
        vehicles.add(new Truck("TRUCK123", 4000, "TRUCKINS003")); // Truck with rental rate and insurance

        // Processing each vehicle
        int rentalDays = 5; // Example: 5 days rental
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(rentalDays); // Calculate rental cost
            double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0; // Calculate insurance if applicable

            // Display vehicle details
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + rentalCost);
            System.out.println("Insurance Cost: $" + insuranceCost);

            // Display insurance details if applicable
            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }

        }
    }
}
