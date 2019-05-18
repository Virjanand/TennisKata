import java.util.HashMap;
import java.util.Map;

public class Score {

    private int score1 = 0;
    private int score2 = 0;

    private static final Map<Integer, String> scores = new HashMap<Integer, String>();

    Score() {
        scores.put(0, "Love");
        scores.put(1, "Fifteen");
        scores.put(2, "Thirty");
        scores.put(3, "Forty");
    }

    void increaseScore(int player) {
        if (player == 1) {
            score1++;
        } else {
            score2++;
        }
    }

    String buildScore(String player1Name, String player2Name) {
        if (isScoreEqual())
            return buildEqualScore();
        if (isEndGame()) {
            if (isAdvantage())
                return buildAdvantage(player1Name, player2Name);

            return buildWin(player1Name, player2Name);
        }
        return buildScore();
    }

    private boolean isScoreEqual() {
        return score1 == score2;
    }

    private String buildEqualScore() {
        if (score1 >= 3)
            return "Deuce";
        return convertScore(score1) + "-All";
    }

    private boolean isEndGame() {
        return score1 >= 4 || score2 >= 4;
    }

    private boolean isAdvantage() {
        return getAbsDifferenceScore() == 1;
    }

    private String buildAdvantage(String player1Name, String player2Name) {
        return "Advantage " + getWinningPlayer(player1Name, player2Name);
    }

    private String buildWin(String player1Name, String player2Name) {
        return "Win for " + getWinningPlayer(player1Name, player2Name);
    }

    private String buildScore() {
        return convertScore(score1) + "-" + convertScore(score2);
    }

    private String convertScore(int scoreNumber) {
        return scores.get(scoreNumber);
    }

    private int getAbsDifferenceScore() {
        return Math.abs(score1 - score2);
    }

    private String getWinningPlayer(String player1Name, String player2Name) {
        if (score1 > score2) return player1Name;
        return player2Name;
    }
}
