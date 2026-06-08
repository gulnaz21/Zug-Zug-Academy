package com.academy.zug_zug.Homework.ep26.ERPClasses;

import lombok.Getter;

import java.util.*;

@Getter
public class ProductManager {
    private final Set<Product> products;
    private static int i = 0;

    public ProductManager() {
        products = new HashSet<>();
    }

    public void addProducts(String name, Category category) {
        products.add(new Product(i++, name, category));
    }

    public void removeProduct(Category category, String name) {
        products.remove(new Product(i++, name, category));
    }

    public List<Product> findProductsByCategory(Category category) {
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory() == category) {
                list.add(product);
            }
        }
        return list;
    }

    public Map<Category, List<Product>> groupProductsByCategory() {
        Map<Category, List<Product>> map = new HashMap<>();
        Set<Category> categorySet = new HashSet<>();

        for (Product product : products) {
            categorySet.add(product.getCategory());
        }
        while (categorySet.iterator().hasNext()) {
            Category category = categorySet.iterator().next();
            map.put(category, findProductsByCategory(category));
            categorySet.remove(category);
        }
        return map;
    }

    public void printAllProducts() {
        Map<Category, List<Product>> map = new HashMap<>();
        map = groupProductsByCategory();
        for (Map.Entry<Category, List<Product>> entry : map.entrySet()) {
            Category key = entry.getKey();
            List<Product> value = entry.getValue();
            System.out.println("Категория: " + key);
            System.out.println("Продукты:");
            for (Product product : value) {
                System.out.println("- " + product.getName());
            }
        }
    }
}
