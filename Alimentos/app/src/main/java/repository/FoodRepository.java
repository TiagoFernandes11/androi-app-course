package repository;

import java.util.ArrayList;
import java.util.List;

import entities.FoodEntity;

public class FoodRepository {
    private List<FoodEntity> mListFood;

    public FoodRepository() {
        this.mListFood = new ArrayList<>();
        this.mListFood.add(new FoodEntity(0, "Salad", 8));
        this.mListFood.add(new FoodEntity(1, "Pizza", 12));
        this.mListFood.add(new FoodEntity(2, "Burger", 10));
        this.mListFood.add(new FoodEntity(3, "Sushi", 15));
        this.mListFood.add(new FoodEntity(4, "Pasta", 10));
        this.mListFood.add(new FoodEntity(5, "Steak", 20));
        this.mListFood.add(new FoodEntity(6, "Soup", 6));
        this.mListFood.add(new FoodEntity(7, "Tacos", 9));
        this.mListFood.add(new FoodEntity(8, "Sandwich", 7));
        this.mListFood.add(new FoodEntity(9, "Ramen", 11));
        this.mListFood.add(new FoodEntity(10, "Fried Chicken", 13));
        this.mListFood.add(new FoodEntity(11, "Fish and Chips", 14));
        this.mListFood.add(new FoodEntity(12, "Lasagna", 12));
        this.mListFood.add(new FoodEntity(13, "Stir Fry", 11));
        this.mListFood.add(new FoodEntity(14, "Tofu Scramble", 9));
        this.mListFood.add(new FoodEntity(15, "Fajitas", 10));
        this.mListFood.add(new FoodEntity(16, "Curry", 13));
    }

    public FoodEntity get(int id) {
        return this.mListFood.get(id);
    }

    public List<FoodEntity> getList() {
        return this.mListFood;
    }
}
