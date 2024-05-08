package repository;

import java.util.ArrayList;
import java.util.List;

import entities.FoodEntity;

public class FoodRepository {
    private List<FoodEntity> mListFood;

    public FoodRepository() {
        this.mListFood = new ArrayList<>();
        mListFood.add(new FoodEntity(1, "Apple", 52, 1, "piece", "A juicy fruit"));
        mListFood.add(new FoodEntity(2, "Banana", 105, 1, "piece", "A yellow fruit"));
        mListFood.add(new FoodEntity(3, "Pizza Slice", 285, 1, "slice", "A delicious slice of pizza"));
        mListFood.add(new FoodEntity(4, "Chicken Breast", 165, 1, "piece", "Lean protein"));
        mListFood.add(new FoodEntity(5, "Rice", 206, 100, "grams", "A staple carbohydrate"));
        mListFood.add(new FoodEntity(6, "Spinach", 23, 100, "grams", "Nutrient-rich leafy green"));
        mListFood.add(new FoodEntity(7, "Salmon", 206, 100, "grams", "Healthy fatty fish"));
        mListFood.add(new FoodEntity(8, "Egg", 78, 1, "piece", "Good source of protein"));
        mListFood.add(new FoodEntity(9, "Yogurt", 150, 150, "grams", "Probiotic dairy product"));
        mListFood.add(new FoodEntity(10, "Oatmeal", 159, 100, "grams", "High-fiber breakfast option"));
        mListFood.add(new FoodEntity(11, "Avocado", 160, 1, "piece", "Healthy fat source"));
        mListFood.add(new FoodEntity(12, "Cucumber", 16, 1, "piece", "Hydrating vegetable"));
        mListFood.add(new FoodEntity(13, "Orange", 62, 1, "piece", "Citrus fruit rich in vitamin C"));
        mListFood.add(new FoodEntity(14, "Tomato", 18, 1, "piece", "Versatile cooking ingredient"));
        mListFood.add(new FoodEntity(15, "Beef", 250, 100, "grams", "Protein-rich meat"));
    }

    public FoodEntity get(int id) {
        return this.mListFood.get(id);
    }

    public List<FoodEntity> getList() {
        return this.mListFood;
    }
}
