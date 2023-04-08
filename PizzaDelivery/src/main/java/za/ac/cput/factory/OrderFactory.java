package za.ac.cput.factory;

import za.ac.cput.domain.Order;
import za.ac.cput.util.Helper;

import java.time.LocalDate;


/* OrderFactory.java
 Author: Timothy Lombard (220154856)
 Date: 4th April (last updated) 2023
*/

    public class OrderFactory {

        public static Order buildOrder(LocalDate createDate) {
            if (Helper.isNullOrEmpty(String.valueOf(Helper.isNullOrEmpty(String.valueOf(createDate))))) {
                return null;
            }

            String orderId = Helper.generateId();

            Order order = new Order.Builder().setOrderId(orderId).setCreateDate(createDate).build();
            return order;

        }

    }

