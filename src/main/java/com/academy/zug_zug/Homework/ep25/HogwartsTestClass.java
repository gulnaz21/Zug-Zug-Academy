package com.academy.zug_zug.Homework.ep25;

import com.academy.zug_zug.Homework.ep25.SpellClasses.ConstantContainer;
import com.academy.zug_zug.Homework.ep25.SpellClasses.HogwartsSpells;

import java.util.random.RandomGenerator;

public class HogwartsTestClass {
    public static void main(String[] args) {
        HogwartsSpells hogwartsSpells = new HogwartsSpells();

        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.addSpellEvent("Fire", "Kill all enemies without pain");
        hogwartsSpells.deleteSpellEvent(RandomGenerator.getDefault().nextInt(ConstantContainer.getOneNumber()));
        System.out.println(hogwartsSpells.getSpellEventById(RandomGenerator.getDefault().nextInt(ConstantContainer.getNumber())));
    }
}
