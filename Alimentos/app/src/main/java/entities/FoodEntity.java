package entities;

public class FoodEntity {
    private int id;
    private String name;
    private int calories;
    private int quantity;
    private String unity;
    private String description;

    public FoodEntity() {
    }

    public FoodEntity(int id, String name, int calories, int quantity, String unity, String description) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.quantity = quantity;
        this.unity = unity;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
