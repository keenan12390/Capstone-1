package za.ac.cput.repository;

import za.ac.cput.domain.Chef;

import java.util.Set;

/*
* IChefRepository.java
* Author: Dawood Kamalie
* Date: 8/4/2023
* */

public interface IChefRepository extends IRepository<Chef, String>{
    public Set<Chef> getAll();
}
