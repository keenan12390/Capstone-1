package za.ac.cput.repository;

import za.ac.cput.domain.Employee;

import java.util.Set;

/*
 * IEmployeeRepository.java
 * Author: Dawood Kamalie
 * Date: 8/4/2023
 * */

public interface IEmployeeRepository extends IRepository<Employee, String> {
    public Set<Employee> getAll();
}
