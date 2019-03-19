package view;

public class ResultView {
    private static final char BAR = '|';
    private static final String[] FRAME = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10"};

    public static void board(String playerName) {
        StringBuilder stringBuilder = new StringBuilder();
        init(stringBuilder);
        player(stringBuilder, playerName);

        System.out.println(stringBuilder.toString());
        
        for (int i = 0; i < FRAME.length; i++) {
            System.out.print(BAR);
        }
    }

    private static void init(StringBuilder stringBuilder) {
        stringBuilder.append(BAR).append(String.format("%5s", "NAME")).append(" ").append(BAR);
        for (int i = 0; i < FRAME.length; i++) {
            stringBuilder.append(String.format("%4s", FRAME[i])).append("  ").append(BAR);
        }
        stringBuilder.append(System.lineSeparator());
    }

    private static void player(StringBuilder stringBuilder, String playerName) {
        stringBuilder.append(BAR).append(String.format("%5s", playerName)).append(" ").append(BAR);
//        if () {
//
//        }
        for (int i = 0; i < FRAME.length; i++) {
            stringBuilder.append(String.format("%4s", FRAME[i])).append("  ").append(BAR);
        }
    }
}
