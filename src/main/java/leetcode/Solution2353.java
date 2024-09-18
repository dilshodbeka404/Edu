package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution2353 {

    public static void main(String[] args) {

        FoodRatings foodRatings = new FoodRatings(
                new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                new int[]{9, 12, 8, 15, 14, 7}
        );
    }

    static class FoodRatings {
        private final Map<String, String> foodCuisinesMap;
        private final Map<String, Map<String, Integer>> cuisineFoodsMap;

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            this.foodCuisinesMap = new HashMap<>();
            this.cuisineFoodsMap = new HashMap<>();

            for (int i = 0; i < foods.length; i++) {
                String cuisine = cuisines[i];
                String food = foods[i];
                int rating = ratings[i];

                foodCuisinesMap.put(food, cuisine);

                Map<String, Integer> foodMap = cuisineFoodsMap.get(cuisine);
                if (Objects.nonNull(foodMap)) {
                    foodMap.put(food, rating);
                } else {
                    foodMap = new HashMap<>();
                    foodMap.put(food, rating);
                    cuisineFoodsMap.put(cuisine, foodMap);
                }
            }
        }

        public void changeRating(String food, int newRating) {
            Map<String, Integer> foodMap = cuisineFoodsMap.get(foodCuisinesMap.get(food));
            foodMap.put(food, newRating);
        }

        public String highestRated(String cuisine) {
            String highestFood = "";
            Integer highestRating = 0;

            for (Map.Entry<String, Integer> food : cuisineFoodsMap.get(cuisine).entrySet()) {
                if (
                        highestRating < food.getValue() ||
                                (food.getValue().equals(highestRating) && food.getKey().compareTo(highestFood) < 0)
                ) {
                    highestRating = food.getValue();
                    highestFood = food.getKey();
                }
            }
            return highestFood;
        }
    }

}

class FoodRatings {
    private final Map<String, String> foodCuisinesMap;
    private final Map<String, Food> cuisineFoodsMap;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.foodCuisinesMap = new HashMap<>();
        this.cuisineFoodsMap = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String cuisineName = cuisines[i];
            String foodName = foods[i];
            int foodRating = ratings[i];

            foodCuisinesMap.put(foodName, cuisineName);

            change(cuisineName, foodName, foodRating);
        }
    }

    private void change(String cuisineName, String foodName, int foodRating) {
        Food food = cuisineFoodsMap.get(cuisineName);
        if (food != null) {
            cuisineFoodsMap.put(cuisineName, getHighestFood(food, foodName, foodRating));
        } else {
            food = new Food(foodName, foodRating);
            cuisineFoodsMap.put(cuisineName, food);
        }
    }

    public void changeRating(String foodName, int newRating) {
        String cuisine = foodCuisinesMap.get(foodName);
        change(cuisine, foodName, newRating);
    }

    public String highestRated(String cuisine) {
        return cuisineFoodsMap.get(cuisine).name;
    }

    private Food getHighestFood(Food food, String newFoodName, int newFoodRating) {
        if (
                food.rating < newFoodRating ||
                        (food.name == newFoodName && newFoodName.compareTo(food.name) > 0)
        ) {
            food.name = newFoodName;
            food.rating = newFoodRating;
        }
        return food;
    }
}

class Food {
    String name;
    int rating;

    public Food(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
}
