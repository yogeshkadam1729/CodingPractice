package com.practice.designPatterns.structural.flywight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private  Map<Character,CharacterFlyWeight> characterPool = new HashMap<>();

    public CharacterFlyWeight getCharacter(char symbol) {
        CharacterFlyWeight character = characterPool.get(symbol);
        if(character == null) {
            character = new Character(symbol);
            characterPool.put(new Character(symbol),character);
        }
        return character;
    }
}
