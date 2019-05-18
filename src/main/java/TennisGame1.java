import java.util.HashMap;
import java.util.Map;

public class TennisGame1 implements TennisGame {

    private Score score;
    private String player1Name;
    private String player2Name;
    private static final Map<Integer, String> scores = new HashMap<Integer, String>();


    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.score = new Score();
        scores.put(0, "Love");
        scores.put(1, "Fifteen");
        scores.put(2, "Thirty");
        scores.put(3, "Forty");
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name))
            score.increaseScore1();
        else
            score.increaseScore2();
    }

    public String getScore() {
        if (score.getScore1() == score.getScore2()) {
            return buildEqualScore();
        } else if (isEndGame()) {
            return buildAdvantageOrWinScore();
        } else {
            return buildScore();
        }
    }

    private boolean isEndGame() {
        return score.getScore1() >= 4 || score.getScore2() >= 4;
    }

    private String buildAdvantageOrWinScore() {
        int minusResult = Math.abs(score.getScore1() - score.getScore2());
        if (minusResult == 1) return buildAdvantage();

        return buildWin();
    }

    private String buildAdvantage() {
        return "Advantage " + getWinningPlayer();
    }

    private String buildWin() {
        return "Win for " + getWinningPlayer();
    }

    private String getWinningPlayer() {
        if (score.getScore1() > score.getScore2()) return player1Name;
        return player2Name;
    }

    private String buildEqualScore() {
        if (score.getScore1() >= 3)
            return "Deuce";
        return convertScore(score.getScore1()) + "-All";
    }

    private String buildScore() {
        return convertScore(score.getScore1()) + "-" + convertScore(score.getScore2());
    }

    private String convertScore(int scoreNumber) {
        return scores.get(scoreNumber);
    }
}
