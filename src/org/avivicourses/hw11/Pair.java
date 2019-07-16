package org.avivicourses.hw11;

public class Pair<L,R> {
    private L name;
    private R value;

    public Pair(L name, R value) {
        this.name = name;
        this.value = value;
    }

    public L getName() {
        return name;
    }

    public R getValue() {
        return value;
    }

}
