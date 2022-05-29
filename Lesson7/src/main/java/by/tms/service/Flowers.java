package by.tms.service;

import lombok.Getter;

@Getter
public enum Flowers {
    ROSE("ROSE", 15),
    LILY("LILY", 7),
    ASTER("ASTER", 5),
    HERBERA("HERBERA", 5),
    TULIP("TULIP", 8),
    CARNATION("CARNATION", 11);

    private String name;
    private int cost;

    Flowers(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
