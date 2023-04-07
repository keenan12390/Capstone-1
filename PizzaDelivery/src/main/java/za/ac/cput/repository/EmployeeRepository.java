package za.ac.cput.repository;

import za.ac.cput.domain.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository implements IEmployeeRepository{
    private static EmployeeRepository repository = null;
    private Set<Employee> employeeDB = null;

    private EmployeeRepository()
    {
        employeeDB = new HashSet<Employee>();
    }
    public static EmployeeRepository getRepository(){
        if(repository == null)
            repository = new EmployeeRepository();
        return repository;
    }
    @Override
    public Employee create(Employee employee) {
        boolean success = employeeDB.add(employee);
        if(!success)
            return null;
        return employee;
    }

    @Override
    public Employee read(String employeeId) {
        for (Employee e: employeeDB
             ) {
            if(e.getEmpId().equals(employeeId))
                return e;


        } return null;
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getEmpId());
        if(oldEmployee != null) {
            employeeDB.remove(oldEmployee);
            employeeDB.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String employeeNumber) {
        Employee employeeToDelete = read(employeeNumber);
        if(employeeToDelete == null)
            return false;
        employeeDB.remove(employeeToDelete);
        return true;
    }
    @Override
    public Set<Employee> getAll() {
        return null;
    }
}
