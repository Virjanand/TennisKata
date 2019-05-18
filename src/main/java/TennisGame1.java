public class TennisGame1 implements TennisGame {

    private Score score;

    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.score = new Score();
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            score.increaseScore(1);
        else
            score.increaseScore(2);
    }

    public String getScore() {
        return score.buildScore(player1Name, player2Name);
    }
}
