package com.foodtruck;

import java.util.HashMap;

public class Menu {
    private HashMap<String, MenuItem> items;

    public Menu() {
        items = new HashMap<>();

        // Salads (5)
        items.put("salad_greek", new Salad("Greek Salad", 7.50));
        items.put("salad_caesar", new Salad("Caesar Salad", 7.25));
        items.put("salad_garden", new Salad("Garden Salad", 6.75));
        items.put("salad_green", new Salad("Green Salad"), 300.25);
        items.put("salad_meat", new Salad("Meat Salad"), 15.50);

        // Sandwiches (5)
        items.put("sandwich_turkey", new Sandwich("Turkey Sandwich", 9.50));
        items.put("sandwich_veggie", new Sandwich("Veggie Sandwich", 8.75));
        items.put("sandwich_tuna", new Sandwich("Tuna Sandwich", 9.25));
        items.put("sandwich_green", new Sandwich("Green Sandwich", 250.25));
        items.put("sandwich_beef", new Sandwich("Beef Sandwich", 20.35));

        // Drinks (5)
        items.put("drink_water", new Drink("Water", 1.50));
        items.put("drink_lemonade", new Drink("Lemonade", 2.75));
        items.put("drink_icedtea", new Drink("Iced Tea", 2.50));
        items.put("drink_green", new Drink("Green Drink", 150.55));
        items.put("drink_meat", new Drink("Meat Drink"), 5.50)
    }

    public MenuItem getItem(String code) {
        return items.get(code);
    }
}

