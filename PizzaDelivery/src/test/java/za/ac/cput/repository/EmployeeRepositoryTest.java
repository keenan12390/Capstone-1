package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeRepositoryTest {
    private static EmployeeRepository repository = EmployeeRepository.getRepository();
    private static Employee employee = EmployeeFactory.createEmployee("001", "Dawood", "Kamalie");

    @Test
    void a_create() {
        Employee created = repository.create(employee);
        assertEquals(employee.getEmpId() , created.getEmpId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Employee read = repository.read(employee.getEmpId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Employee updated = new Employee.Builder().copy(employee).setEmpName("Jack").setEmpSurname("Blue").build();
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(employee.getEmpId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}