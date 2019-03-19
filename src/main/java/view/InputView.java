package view;

import java.util.Scanner;

public class InputView {
    public static String playerName(Scanner sc) {
        System.out.print("플레이어 이름은(3 english letters)?: ");
        String name = sc.nextLine();
        if (name.length() > 3) {
            throw new IllegalArgumentException("이름은 3자를 초과할 수 없습니다.");
        }
        return name;
    }
}
