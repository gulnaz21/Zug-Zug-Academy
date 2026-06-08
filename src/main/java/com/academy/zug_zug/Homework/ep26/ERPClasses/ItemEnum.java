package com.academy.zug_zug.Homework.ep26.ERPClasses;

import lombok.Getter;

@Getter
public enum ItemEnum {
    Potato("Картошока"),
    Pencil("БигПенсил"),
    Burrito("Кушоц"),
    Apple("Яблоко"),
    Knife("Нож");

    private String title;

    ItemEnum(String title) {
        this.title = title;
    }
}
