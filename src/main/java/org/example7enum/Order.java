package org.example7enum;

public class Order {
    private Status status;

    public enum Status {
        ORDERED,
        ON_ROUTE,
        DELIVERED
    }

    boolean isDelivered() {
        if(getStatus() == Status.DELIVERED) {
            return true;
        }
        return false;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
