package org.example7enum;

public class App {
    public static void main(String[] args) {
        Order.Status status = Order.Status.DELIVERED;
        Order order = new Order();
        order.setStatus(status);
        System.out.println(order.isDelivered());

        switch (order.getStatus()) {
            case ON_ROUTE:
                System.out.println("jest w drodze");
                break;
            case ORDERED:
                System.out.println("zamówiono");
                break;
            case DELIVERED:
                System.out.println("doreczono");
                break;
        }
    }
}
