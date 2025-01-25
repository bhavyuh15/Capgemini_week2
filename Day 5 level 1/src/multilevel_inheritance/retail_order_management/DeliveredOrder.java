package multilevel_inheritance.retail_order_management;

// Subclass: multilevel_inheritance.retail_order_management.DeliveredOrder
public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor for multilevel_inheritance.retail_order_management.DeliveredOrder
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call to the superclass constructor
        this.deliveryDate = deliveryDate;
    }

    // Override getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "multilevel_inheritance.retail_order_management.Order delivered on: " + deliveryDate;
    }

    // Method to display delivered order details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
