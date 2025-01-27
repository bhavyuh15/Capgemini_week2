package ridehailingapplication;

// Interface
// Defines GPS functionality for vehicles
public interface GPS {
    String getCurrentLocation(); // Get the current location of the vehicle
    void updateLocation(String location); // Update the vehicle's location
}
