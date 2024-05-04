package business;

import java.util.List;

import entities.FoodEntity;
import repository.FoodRepository;

public class FoodBusiness {

    public FoodEntity get(int id){
        return new FoodRepository().get(id);
    }

    public List<FoodEntity> getList() {
        return new FoodRepository().getList();
    }
}
