package org.avivicourses.hw9;

public enum Developer {
    TEAM_LEAD (9), JUNIOR(3), TRAINEE(1);

    private int rate;

    Developer(int rate){
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Payment: $" + rate + " per hour";
    }
}
