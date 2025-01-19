package com.practice.designPatterns.structural.flywight;

public class FlyWeightCharacterTest {
    public static void main(String args []) {
        CharacterFactory factory = new CharacterFactory();
        int fontSize = 12;
        String fontStyle = "Aerial";
        int x = 0;
        String test = "hello";
        for(char c : test.toCharArray()) {
            CharacterFlyWeight character = factory.getCharacter(c);
            character.render(fontSize,fontStyle,x,0);
            x = x+10;
        }
    }
}
