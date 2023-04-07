package za.ac.cput.factory;
/*
DriverFactory.java
Author: Azhar Allie Mohammed (217250513)
Date: 04/04/2023
*/

import za.ac.cput.domain.Driver;

public class DriverFactory {
    public static Driver createDriver(String driverId){
        return new Driver.Builder().setDriverId(driverId)
                .build();
    }
}
