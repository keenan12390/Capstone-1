package za.ac.cput.domain;

import java.time.LocalDate;
import java.util.Objects;

/* Order.java
 Entity for the Order
 Author: Timothy Lombard (220154856)
 Date: 4th April (last updated) 2023
*/

    public class Order {

        private String orderId;

        private LocalDate createDate;

        private Order(){

        }

        private Order(Builder builder){
            this.orderId = builder.orderId;
            this.createDate = builder.createDate;
        }

        public String getOrderId() {
            return orderId;
        }

        public LocalDate getCreateDate() {
            return createDate;
        }

        public static class Builder {
            private String orderId;
            private LocalDate createDate;


            public za.ac.cput.domain.Order.Builder setOrderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public za.ac.cput.domain.Order.Builder setCreateDate(LocalDate createDate){
                this.createDate = createDate;
                return this;
            }


            public za.ac.cput.domain.Order.Builder copy(za.ac.cput.domain.Order order) {
                this.orderId = order.orderId;
                this.createDate = order.createDate;
                return this;
            }


            public za.ac.cput.domain.Order build() {
                return new za.ac.cput.domain.Order(this);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            za.ac.cput.domain.Order order = (za.ac.cput.domain.Order) o;
            return  Objects.equals(orderId, order.orderId) && Objects.equals(createDate, order.createDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(orderId, createDate);
        }

        @Override
        public String toString() {
            return "Order{" +
                    "Order Id='" + orderId + '\'' +
                    ", Create date=" + createDate +
                    '}';
        }
    }


