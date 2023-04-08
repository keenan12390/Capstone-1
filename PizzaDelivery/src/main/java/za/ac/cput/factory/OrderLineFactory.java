package za.ac.cput.factory;

import za.ac.cput.domain.OrderLine;
import za.ac.cput.util.Helper;

/*
OrderLineFactory.java
Author: Tamryn Lisa Lewin (219211981)
Date: 04 April 2023
 */

public class OrderLineFactory {
    public static OrderLine buildOrderLine(int quantity) {
        if(Helper.isNullOrEmpty(String.valueOf(quantity))) {
            return null;
        }

        String orderLineId = Helper.generateId();

        OrderLine orderLine = new OrderLine.Builder()
                .setOrderLineId(orderLineId)
                .setQuantity(quantity)
                .build();
        return orderLine;
    }
}
