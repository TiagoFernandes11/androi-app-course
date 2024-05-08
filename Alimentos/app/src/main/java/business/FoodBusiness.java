package business;

import java.util.ArrayList;
import java.util.List;

import constants.FoodConstats;
import entities.FoodEntity;
import repository.FoodRepository;

public class FoodBusiness {

    private FoodRepository mFoodRepository = new FoodRepository();

    public FoodEntity get(int id) {
        return this.mFoodRepository.get(id);
    }

    public List<FoodEntity> getList(int filter) {
        List<FoodEntity> list = this.mFoodRepository.getList();
        List<FoodEntity> filtered = new ArrayList<>();
        if (filter == FoodConstats.FILTER.NO_FILTER){
            return list;
        }
        for (FoodEntity f : list) {
            if (filter == FoodConstats.FILTER.CAL_LOW) {
                if (f.getCalories() <= 99) {
                    filtered.add(f);
                } else if (filter == FoodConstats.FILTER.CAL_MEDIUM) {
                    if (f.getCalories() >= 100 && f.getCalories() <= 299) {
                        filtered.add(f);
                    }
                } else if (filter == FoodConstats.FILTER.CAL_HIGH) {
                    filtered.add(f);
                }
            }

        }
        return filtered;
    }
}
