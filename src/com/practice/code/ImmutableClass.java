package com.practice.code;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final String name;
    private final ArrayList<String> nickNames;

    public ImmutableClass(String name, List<String> nicknames) {
        this.name = name;
        ArrayList<String> tempList = new ArrayList<>();
        if(nicknames != null) {
            nicknames.forEach(e -> {
                tempList.add(e);
            });
        }
        this.nickNames = tempList;

    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getNickNames() {
        return (ArrayList<String>) this.nickNames.clone();
    }
}
