package com.academy.zug_zug.Homework.ep25.SpellClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HogwartsSpells {
    private final HashMap<Integer, SpellEvent> spellById;
    private final HashMap<String, ArrayList<SpellEvent>> spellsByType;

    public HogwartsSpells() {
        spellById = new HashMap<>();
        spellsByType = new HashMap<>();
    }

    public void addSpellEvent(String eventType, String actionDescription) {
        ArrayList<SpellEvent> list = new ArrayList<>();
        SpellEvent spellEvent = new SpellEvent(ConstantContainer.getIdentifierOfSpell(), eventType, actionDescription);
        spellById.put(ConstantContainer.getIdentifierOfSpellEvent(), spellEvent);
        if (spellsByType.containsKey(eventType)) {
            list = spellsByType.get(eventType);
            list.add(spellEvent);
        } else {
            list.add(spellEvent);
            spellsByType.put(eventType, list);
        }
    }

    public SpellEvent getSpellEventById(int id) {
        return spellById.get(id);
    }

    public ArrayList<SpellEvent> getSpellEventsByType(String eventType) {
        return spellsByType.get(eventType);
    }

    public void deleteSpellEvent(int id) {
        if (spellById.containsKey(id)) {
            String spellName = getSpellEventById(id).getEventType();
            spellById.remove(id);
            spellsByType.remove(spellName);
            ConstantContainer.setIdentifierOfSpellEvent(id);
            ConstantContainer.setIdentifierOfSpell(id);
        }
    }

    public void printAllSpellEvents() {
        for (Map.Entry<Integer, SpellEvent> iterator : spellById.entrySet()) {
            System.out.println(iterator.toString());
        }
    }
}
