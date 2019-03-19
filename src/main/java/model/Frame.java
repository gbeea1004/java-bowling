package model;

import java.util.ArrayList;
import java.util.List;

public class Frame {
    private static final int START_PIN = 10;
    private List<Integer> hitPins = new ArrayList<>();

    public Frame(int score) {
        if (0 > score || 10 < score) {
            throw new IllegalArgumentException("맞춘 핀의 범위는 0 ~ 10 사이여야 합니다.");
        }
        play(score);
    }

    public void play(int score) {
        if (hitPins.size() > 2) {
            throw new ArrayIndexOutOfBoundsException("범위 초과");
        }
        hitPins.add(score);
    }

    public int remainPin() {
        int remainPin = START_PIN;
        for (Integer pin : hitPins) {
            remainPin -= pin;
        }
        return remainPin;
    }

    public String status() {
        if (hitPins.get(0) == 10) {
            return "스트라이크";
        }
        if (hitPins.get(0) + hitPins.get(1) == 10) {
            return "스페어";
        }
        return "맞춘 공 : " + (hitPins.get(0) + hitPins.get(1));
    }
}
