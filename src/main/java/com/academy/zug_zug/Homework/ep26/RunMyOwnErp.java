package com.academy.zug_zug.Homework.ep26;

import com.academy.zug_zug.Homework.ep26.ERPClasses.Category;
import com.academy.zug_zug.Homework.ep26.ERPClasses.ItemEnum;
import com.academy.zug_zug.Homework.ep26.ERPClasses.ProductManager;

public class RunMyOwnErp {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProducts(ItemEnum.Burrito.getTitle(), Category.FOOD);
        productManager.addProducts(ItemEnum.Potato.getTitle(), Category.FOOD);
        productManager.addProducts(ItemEnum.Apple.getTitle(), Category.FOOD);
        productManager.addProducts(ItemEnum.Knife.getTitle(), Category.OTHERS);
        productManager.addProducts(ItemEnum.Pencil.getTitle(), Category.OTHERS);
        productManager.removeProduct(Category.FOOD, ItemEnum.Potato.getTitle());
        productManager.removeProduct(Category.OTHERS, ItemEnum.Apple.getTitle());
        productManager.printAllProducts();
    }
}
