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
        String score;
        if (m_score1 == m_score2) {
            score = buildEqualScore();
        } else if (isEndGame()) {
            score = buildAdvantageOrWinScore();
        } else {
            score = buildScore();
        }
        return score;
    }

    private boolean isEndGame() {
        return m_score1 >= 4 || m_score2 >= 4;
    }

    private String buildAdvantageOrWinScore() {
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) return "Advantage player1";
        else if (minusResult == -1) return "Advantage player2";
        else if (minusResult >= 2) return "Win for player1";
        return "Win for player2";
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
