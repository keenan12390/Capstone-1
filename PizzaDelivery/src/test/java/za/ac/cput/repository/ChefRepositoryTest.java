package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Chef;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.ChefFactory;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

/*
 * ChefRepositoryTest.java
 * Author: Dawood Kamalie  (220147760)
 * Date: 8/4/2023
 * */

@TestMethodOrder(MethodOrderer.MethodName.class)
class ChefRepositoryTest {
    private static ChefRepository repository = ChefRepository.getRepository();
    private static Chef chef = ChefFactory.createChef("001", "Dawood", "Kamalie", "01", "French", "French Cuisine, Pastry");

    @Test
    void a_create() {
        Chef created = repository.create(chef);
        assertEquals(chef.getChefId() , created.getChefId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Chef read = repository.read(chef.getChefId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Chef updated = new Chef.Builder().copy(chef).setChefName("Jack").setChefSurname("Blue").setNationality("German").build();
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(chef.getChefId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}