import java.util.HashMap;
import java.util.Map;

public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;
    private static final Map<Integer, String> scores = new HashMap<Integer, String>();


    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        scores.put(0, "Love");
        scores.put(1, "Fifteen");
        scores.put(2, "Thirty");
        scores.put(3, "Forty");
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        if (m_score1 == m_score2) {
            return buildEqualScore();
        } else if (isEndGame()) {
            return buildAdvantageOrWinScore();
        } else {
            return buildScore();
        }
    }

    private boolean isEndGame() {
        return m_score1 >= 4 || m_score2 >= 4;
    }

    private String buildAdvantageOrWinScore() {
        int minusResult = Math.abs(m_score1 - m_score2);
        if (minusResult == 1) return buildAdvantage();

        return buildWin();
    }

    private String buildAdvantage() {
        if (m_score1 > m_score2) return "Advantage " + player1Name;
        return "Advantage " + player2Name;
    }

    private String buildWin() {
        if (m_score1 > m_score2) return "Win for " + player1Name;
        return "Win for " + player2Name;
    }

    private String buildEqualScore() {
        if (m_score1 >= 3)
            return "Deuce";
        return convertScore(m_score1) + "-All";
    }

    private String buildScore() {
        return convertScore(m_score1) + "-" + convertScore(m_score2);
    }

    private String convertScore(int scoreNumber) {
        return scores.get(scoreNumber);
    }
}
