package com.academy.zug_zug.Homework.ep25.SpellClasses;

import java.util.HashSet;

public class ConstantContainer {
    private static int IDENTIFIER_OF_SPELL = 0;
    private static int IDENTIFIER_OF_SPELL_EVENT = 0;
    private final static HashSet<Integer> STORAGE_NUMBER_ONE = new HashSet<>();
    private final static HashSet<Integer> STORAGE_NUMBER_TWO = new HashSet<>();

    public static int getIdentifierOfSpell() {
        int last_value = IDENTIFIER_OF_SPELL++;
        //IDENTIFIER_OF_SPELL++;
        STORAGE_NUMBER_ONE.add(last_value);
        return last_value;
    }

    public static int getIdentifierOfSpellEvent() {
        int last_value = IDENTIFIER_OF_SPELL_EVENT;
        IDENTIFIER_OF_SPELL_EVENT++;
        STORAGE_NUMBER_TWO.add(last_value);
        return last_value;
    }

    public static void setIdentifierOfSpell(int id) {
        STORAGE_NUMBER_ONE.remove(id);
    }

    public static void setIdentifierOfSpellEvent(int id) {
        STORAGE_NUMBER_TWO.remove(id);
    }

    public static int getNumber() {
        return IDENTIFIER_OF_SPELL_EVENT;
    }

    public static int getOneNumber() {
        return STORAGE_NUMBER_TWO.iterator().next();
    }
}
