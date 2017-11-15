package step2;

public class BowlingGame {

    int score=0;

    public void roll(int pins) {
        score += pins;
    }

    public int getScore() {
        return score;
    }
}
