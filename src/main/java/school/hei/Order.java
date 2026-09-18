package school.hei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final String description;
    private final Customer customer;
    private final List<Clothes> customOrders;
    private final double quantity;

    public Order(String description, Customer customer, List<Clothes> customOrders) {
        this(description, customer, customOrders, 1);
    }

    public Order(String description, Customer customer, List<Clothes> customOrders, double quantity) {
        this.description = description;
        this.customer = customer;
        this.customOrders = new ArrayList<>(customOrders);
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Clothes> getCustomOrders() {
        return Collections.unmodifiableList(customOrders);
    }

    public List<Clothes> getClothes() {
        return getCustomOrders();
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (Clothes customOrder : customOrders) {
            totalAmount += customOrder.getPrice() * quantity;
        }
        return totalAmount;
    }
}

