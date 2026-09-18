package school.hei;

import java.util.List;

public class Order {
    private String description;
    private List<Order> CustomOrders;
    private double quantity;

    public Order(String description, List<Order> customOrders, double quantity) {
        this.description = description;
        CustomOrders = customOrders;
        this.quantity = quantity;
    }


    public String getDescription() {
        return description;
    }

    public List<Order> getCustomOrders() {
        return CustomOrders;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (Order customOrder : CustomOrders) {
            totalAmount += customOrder.getPrice() * quantity;
        }
        return totalAmount;
    }

    private double getPrice() {
        double price = 0;
    }

}

