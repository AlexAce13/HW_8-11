package org.avivicourses.hw11;

public class Triple<L,M,R> {
    private L name;
    private M id;
    private R value;

    public Triple(L name, M id, R value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public L getName() {
        return name;
    }

    public M getId() {
        return id;
    }

    public R getValue() {
        return value;
    }

}
