package com.academy.zug_zug.Homework.ep25;

import com.academy.zug_zug.Homework.ep25.SpellClasses.ConstantContainer;
import com.academy.zug_zug.Homework.ep25.SpellClasses.HogwartsSpells;

public class HogwartsTestClass {
    public static void main(String[] args) {
        HogwartsSpells hogwartsSpells = getHogwartsSpells();
        System.out.println(hogwartsSpells.getSpellEventById(ConstantContainer.getOneNumber()).getId());
        System.out.println(hogwartsSpells.getSpellEventsByType("Water"));
        hogwartsSpells.deleteSpellEvent(ConstantContainer.getOneNumber());
        hogwartsSpells.deleteSpellEvent(ConstantContainer.getOneNumber());
        System.out.println(hogwartsSpells.getSpellEventById(ConstantContainer.getOneNumber()));
        System.out.println("_______________________");
        hogwartsSpells.printAllSpellEvents();
    }

    private static HogwartsSpells getHogwartsSpells() {
        HogwartsSpells hogwartsSpells = new HogwartsSpells();
        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.addSpellEvent("Water", "Kill all enemies with pain");
        return hogwartsSpells;
    }
}
