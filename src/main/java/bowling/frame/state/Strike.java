package bowling.frame.state;

import bowling.frame.pin.Pins;
import bowling.frame.pin.Score;

class Strike extends Finished {
    @Override
    public Score getScore() {
        return new Score(Pins.MAX_PINS, 2);
    }

    public Score cacluateAdditionalScore(Score score) {
        if (score.canCalucateScore()) {
            return score;
        }
        return score.bowl(Pins.MAX_PINS);
    }

    @Override
    public String getDesc() {
        return "X";
    }
}