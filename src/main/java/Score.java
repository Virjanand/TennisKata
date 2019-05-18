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

    int getScore1() {
        return score1;
    }

    void increaseScore(int player) {
        if (player == 1) {
            score1++;
        } else {
            score2++;
        }
    }

    int getScore2() {
        return score2;
    }

    private String convertScore(int scoreNumber) {
        return scores.get(scoreNumber);
    }

    String buildScore() {
        return convertScore(getScore1()) + "-" + convertScore(getScore2());
    }

    String buildEqualScore() {
        if (getScore1() >= 3)
            return "Deuce";
        return convertScore(getScore1()) + "-All";
    }

    boolean isEndGame() {
        return getScore1() >= 4 || getScore2() >= 4;
    }

    boolean isScoreEqual() {
        return getScore1() == getScore2();
    }

    String getWinningPlayer(TennisGame1 game) {
        if (getScore1() > getScore2()) return game.getPlayer1Name();
        return game.getPlayer2Name();
    }

    String buildWin(TennisGame1 game) {
        return "Win for " + getWinningPlayer(game);
    }

    int getScoreDifference() {
        return Math.abs(getScore1() - getScore2());
    }

    String buildAdvantage(TennisGame1 game) {
        return "Advantage " + getWinningPlayer(game);
    }

    String buildAdvantageOrWinScore(TennisGame1 tennisGame1) {
        if (getScoreDifference() == 1) return buildAdvantage(tennisGame1);

        return buildWin(tennisGame1);
    }
}
