package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Frame> scores = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void play(int score) {
        scores.add(new Frame(score));
    }

//    public int showScore() {
////        int total = 0;
////        for (Integer score : scores) {
////            total += score;
////        }
////        return total;
//    }
}
