package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

/*
* EmployeeFactory.java
* Author: Dawood Kamalie 220147760
* Date: 7/4/2023
* */

public class EmployeeFactory {
    public static Employee createEmployee(String empId, String empName, String empSurname) {
        if (Helper.isNullOrEmpty(empId) || Helper.isNullOrEmpty(empName) || Helper.isNullOrEmpty(empSurname)) {
            return null;
        }

        String orderId = Helper.generateId();

        Employee employee = new Employee.Builder().setEmpId(empId).setEmpName(empName).setEmpSurname(empSurname).build();
        return employee;
    }
}
