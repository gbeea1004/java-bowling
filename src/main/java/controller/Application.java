package controller;

import view.InputView;
import view.ResultView;

import java.util.Scanner;

public class Application {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        ResultView.board(InputView.playerName(sc));
    }
}
