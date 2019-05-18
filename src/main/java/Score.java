import java.util.HashMap;
import java.util.Map;

public class Score {

    private int score1 = 0;
    private int score2 = 0;

    private static final Map<Integer, String> scores = new HashMap<Integer, String>();

    public Score() {
        scores.put(0, "Love");
        scores.put(1, "Fifteen");
        scores.put(2, "Thirty");
        scores.put(3, "Forty");
    }

    public int getScore1() {
        return score1;
    }

    public void increaseScore1() {
        score1++;
    }

    public int getScore2() {
        return score2;
    }

    public void increaseScore2() {
        score2++;
    }

    private String convertScore(int scoreNumber) {
        return scores.get(scoreNumber);
    }

    public String buildScore() {
        return convertScore(getScore1()) + "-" + convertScore(getScore2());
    }

    public String buildEqualScore() {
        if (getScore1() >= 3)
            return "Deuce";
        return convertScore(getScore1()) + "-All";
    }

    public boolean isEndGame() {
        return getScore1() >= 4 || getScore2() >= 4;
    }
}
