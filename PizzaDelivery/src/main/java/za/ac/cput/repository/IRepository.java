package za.ac.cput.repository;

/*
* IRepository.java
* Author: Shared
* Date: 7/4/2023
* */
public interface IRepository<T, ID> {
    // Contains crud methods
    T create(T t);
    T read(ID id); // Read by id
    T update(T t);
    boolean delte(ID id);  // Delete by id
}
