package com.tnsif.fooddeliverysystem.entities;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	//field
	private Map<FoodItem,Integer>items;
	
	public Cart() {
		items=new HashMap<>();
	}
	//methods
	public void addItem(FoodItem foodItem,int quantity) {
	     items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
	}
	
    public void removeItem(FoodItem foodItem) {
        items.remove(foodItem);
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
            sb.append("Food Item: ").append(entry.getKey().getName()).append(", Quantity: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
	}
}
