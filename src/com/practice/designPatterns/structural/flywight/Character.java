package com.practice.designPatterns.structural.flywight;

// Concrete Flyweight
public class Character implements CharacterFlyWeight{
    private final char symbol;

    public Character(char symbol) {
        this.symbol = symbol;
    }
    @Override
    public void render(int fontSize, String fontStyle, int x, int y) {
        // Extrinsic state (font size, style, position) is passed in as arguments
        System.out.println("Rendering '" + symbol + "' with font size " + fontSize
                + ", style " + fontStyle + " at position (" + x + ", " + y + ")");
    }
    public char getSymbol() { return this.symbol; }
}
