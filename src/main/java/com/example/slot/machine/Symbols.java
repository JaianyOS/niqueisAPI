package com.slotmachine.model;

public enum Symbols {

    BANANA(10),
    MORANGO(20),
    ESTRELA(40);

    private int points;

    Symbols(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
