package com.academy.zug_zug.Homework.ep25.SpellClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Data
public class SpellEvent {
    private int id;
    private String eventType;
    private String action;
}
