package multilevel_inheritance.retail_order_management;


// Base Class: multilevel_inheritance.retail_order_management.Order
class Order {
    int orderId;
    String orderDate;

    // Constructor for multilevel_inheritance.retail_order_management.Order
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("multilevel_inheritance.retail_order_management.Order ID: " + orderId);
        System.out.println("multilevel_inheritance.retail_order_management.Order Date: " + orderDate);
    }

    // Method to return order status
    public String getOrderStatus() {
        return "multilevel_inheritance.retail_order_management.Order placed.";
    }
}




