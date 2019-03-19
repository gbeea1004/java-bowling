package controller;

import view.InputView;

import java.util.Scanner;

public class Application {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        InputView.playerName(sc);
    }
}
