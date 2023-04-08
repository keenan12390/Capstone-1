package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {
    @Test
    void createEmployee() {
        Employee employee = EmployeeFactory.createEmployee("001", "Dawood", "Kamalie");
        System.out.println(employee);
        assertNotNull(employee);
    }
}