package school.hei;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Martha",
                "Alexander",
                java.time.LocalDate.of(1990, 1, 1),
                "Ivandry 34 Bis",
                "martha@gmail.com",
                "+261380999012");

        Customer customer1 = new Customer(
                "John",
                "Doe",
                java.time.LocalDate.of(2000, 5, 15),
                "45 Avenue France",
                "john@gmail.com",
                "+261321204313");

        Clothes clothes = new Clothes("T-Shirt", Height.XL, 5000, Material.COTON);
        Clothes clothes1 = new Clothes("Jean", Height.L, 4000, Material.NYLON);

        List<Order> ordersMartha = List.of(
                new Order("MarthaOrder", customer, List.of(clothes, clothes1)),
                new Order("JhonOrder", customer1, List.of(clothes))
        );

        for (Order order : ordersMartha) {
            System.out.println(order.getDescription() + " as a total of:  " + order.getTotalAmount());
        }
    }
}
