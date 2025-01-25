package single_inheritance.smarthomedevice;

// Main Class
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Create an instance of single_inheritance.smarthomedevice.Thermostat
        Thermostat thermostat = new Thermostat("234", "Active", 22.5);

        // Display the status of the thermostat
        System.out.println("--- single_inheritance.smarthomedevice.Device Status ---");
        thermostat.displayStatus();
    }
}
