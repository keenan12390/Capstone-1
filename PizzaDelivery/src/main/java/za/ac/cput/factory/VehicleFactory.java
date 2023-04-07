package za.ac.cput.factory;
/*
VehicleFactory.java
Author: Azhar Allie Mohammed (217250513)
Date: 04/04/2023
*/

import za.ac.cput.domain.Vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleId, String vehicleType){
        return new Vehicle.Builder().setVehicleId(vehicleId)
                .setVehicleType(vehicleType)
                .build();
    }
}
