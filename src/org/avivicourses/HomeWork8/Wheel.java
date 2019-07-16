package org.avivicourses.HomeWork8;

public class Wheel {
    private int diameter;
    private String season;
    public Wheel(int diameter, String season){
        this.diameter = diameter;
        this.season = season;
    }
    public int getDiameter(){
        return diameter;
    }
    public String getSeason(){
        return season;
    }
}
