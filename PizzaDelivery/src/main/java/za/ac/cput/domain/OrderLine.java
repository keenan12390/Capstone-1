package za.ac.cput.domain;

import java.util.Objects;

/*
OrderLine.java
OrderLine entity
Author: Tamryn Lisa Lewin (219211981)
Date: 04 April 2023
 */

public class OrderLine {
    private String orderLineId;
    private int quantity;

    private OrderLine() {}

    private OrderLine(Builder builder) {
        this.orderLineId = builder.orderLineId;
        this.quantity = builder.quantity;
    }

    public String getOrderLineId() {return orderLineId;}

    public int getQuantity() {return quantity;}

    public static class Builder {
        private String orderLineId;
        private int quantity;

        public Builder setOrderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder copy(OrderLine orderLine) {
            this.orderLineId = orderLine.orderLineId;
            this.quantity = orderLine.quantity;
            return this;
        }

        public OrderLine build() {
            return new OrderLine(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return quantity == orderLine.quantity && orderLineId.equals(orderLine.orderLineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderLineId, quantity);
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "orderLineId='" + orderLineId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
