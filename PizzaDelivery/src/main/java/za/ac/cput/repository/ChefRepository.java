package za.ac.cput.repository;

import za.ac.cput.domain.Chef;
import java.util.HashSet;
import java.util.Set;

/*
 * ChefRepository.java
 * Author: Dawood Kamalie
 * Date: 8/4/2023
 * */

public class ChefRepository implements IChefRepository{
    private static ChefRepository repository = null;
    private Set<Chef> chefDB = null;
    private ChefRepository() {chefDB = new HashSet<>();}
    public static ChefRepository getRepository(){
        if(repository == null)
            repository = new ChefRepository();
        return repository;
    }

    @Override
    public Chef create(Chef chef) {
        boolean success = chefDB.add(chef);
        if(!success)
            return null;
        return chef;
    }

    @Override
    public Chef read(String chefId) {
        for (Chef c: chefDB
        ) {
            if(c.getEmpId().equals(chefId))
                return c;


        } return null;
    }

    @Override
    public Chef update(Chef chef) {
        Chef oldChef = read(chef.getChefId());
        if(oldChef != null) {
            chefDB.remove(oldChef);
            chefDB.add(chef);
            return chef;
        }
        return null;
    }

    @Override
    public boolean delete(String chefId) {
        Chef chefToDelete = read(chefId);
        if(chefToDelete == null)
            return false;
        chefDB.remove(chefToDelete);
        return true;
    }
    @Override
    public Set<Chef> getAll() {
        return null;
    }
}
