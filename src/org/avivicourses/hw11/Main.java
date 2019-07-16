package org.avivicourses.hw11;

public class Main {
    public static void main(String[] args) {
        Pair<String,String> pair1 = new Pair<>("Alex", "Flish");
        Pair<String,Integer> pair2 = new Pair<>("Alex", 26);
        Triple<String,Integer,Double> triple1 = new Triple<>("Model", 384, 1150.4);
        Triple<String,String,Integer> triple2 = new Triple<>("Model", "abc", 1150);

        System.out.println("Pair: " + pair1.getName() + "; " + pair1.getValue());
        System.out.println("Pair: " + pair2.getName() + "; " + pair2.getValue());
        System.out.println("Triple:\nModel: " + triple1.getName() + "; ID: " + triple1.getId() + "; Value: " + triple1.getValue());
        System.out.println("Triple:\nModel: " + triple2.getName() + "; ID: " + triple2.getId() + "; Value: " + triple2.getValue());
    }
}
