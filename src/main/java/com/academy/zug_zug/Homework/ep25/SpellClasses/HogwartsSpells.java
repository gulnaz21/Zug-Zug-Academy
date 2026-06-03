package com.academy.zug_zug.Homework.ep25.SpellClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HogwartsSpells {
    private final Map<Integer, SpellEvent> spellById;
    private final Map<String, List<SpellEvent>> spellsByType;

    public HogwartsSpells() {
        spellById = new HashMap<>();
        spellsByType = new HashMap<>();
    }

    public void addSpellEvent(String eventType, String actionDescription) {
        List<SpellEvent> SpellEventList = new ArrayList<>();
        SpellEvent spellEvent = new SpellEvent(ConstantContainer.getIdentifierOfSpell(), eventType, actionDescription);
        spellById.put(ConstantContainer.getIdentifierOfSpellEvent(), spellEvent);
        if (spellsByType.containsKey(eventType)) {
            SpellEventList = spellsByType.get(eventType);
            SpellEventList.add(spellEvent);
        } else {
            SpellEventList.add(spellEvent);
            spellsByType.put(eventType, SpellEventList);
        }
    }

    public SpellEvent getSpellEventById(int id) {
        return spellById.get(id);
    }

    public List<SpellEvent> getSpellEventsByType(String eventType) {
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
