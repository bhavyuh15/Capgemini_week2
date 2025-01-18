public class HotelBooking {
    private String guestName; // Name of the guest
    private String roomType; // Type of the room (e.g., Single, Double, Suite)
    private int nights; // Number of nights booked

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard Room";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getter for guestName
    public String getGuestName() {
        return guestName;
    }

    // Setter for guestName
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // Getter for roomType
    public String getRoomType() {
        return roomType;
    }

    // Setter for roomType
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Getter for nights
    public int getNights() {
        return nights;
    }

    // Setter for nights
    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display booking information
    public void displayBookingInfo() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Create a booking using the default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayBookingInfo();

        // Create a booking using the parameterized constructor
        HotelBooking booking2 = new HotelBooking("John Doe", "Suite", 3);
        System.out.println("\nParameterized Booking:");
        booking2.displayBookingInfo();

        // Create a booking using the copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nCopied Booking:");
        booking3.displayBookingInfo();
    }
}
