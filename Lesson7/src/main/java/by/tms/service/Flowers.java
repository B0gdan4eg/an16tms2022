package by.tms.service;

import lombok.Getter;

@Getter
public enum Flowers {
    ROSE("ROSE"),
    LILY("LILY"),
    ASTER("ASTER"),
    HERBERA("HERBERA"),
    TULIP("TULIP"),
    CARNATION("CARNATION");

    private final String name;

    Flowers(String name) {
        this.name = name;
    }
}
