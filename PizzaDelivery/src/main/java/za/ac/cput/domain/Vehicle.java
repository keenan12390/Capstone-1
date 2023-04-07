package za.ac.cput.domain;

import java.util.Objects;

/*
Vehicle.java
Author: Azhar Allie Mohammed (217250513)
Date: 04/04/2023
*/
public class Vehicle {
    private String vehicleId;
    private String vehicleType;

    public Vehicle() {
    }

    private Vehicle(Builder builder){
        this.vehicleId = builder.vehicleId;
        this.vehicleType = builder.vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public static class Builder{
        private String vehicleId;
        private String vehicleType;

        public Builder setVehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }

        public Builder setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }

        public Builder copy(Vehicle vehicle){
            this.vehicleId = vehicle.vehicleId;
            this.vehicleType = vehicle.vehicleType;
            return this;
        }

        public Vehicle build(){return new Vehicle(this);}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(vehicleId, builder.vehicleId) && Objects.equals(vehicleType, builder.vehicleType);
        }

        @Override
        public int hashCode() {
            return Objects.hash(vehicleId, vehicleType);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "vehicleId='" + vehicleId + '\'' +
                    ", vehicleType='" + vehicleType + '\'' +
                    '}';
        }

    }
}
