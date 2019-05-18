public class TennisGame1 implements TennisGame {

    private Score score;

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.score = new Score();
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name))
            score.increaseScore(1);
        else
            score.increaseScore(2);
    }

    public String getScore() {
        if (score.isScoreEqual()) {
            return score.buildEqualScore();
        } else if (score.isEndGame()) {
            return score.buildAdvantageOrWinScore(this);
        } else {
            return score.buildScore();
        }
    }

}
