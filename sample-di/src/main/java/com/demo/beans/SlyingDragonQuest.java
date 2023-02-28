package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("dragon")
public class SlyingDragonQuest implements Quest {
    public String goQuest() {
        return "Knight killed the dragon.";
    }
}
