import Score2.EqualScore;
import Score2.Score2;

public class TennisGame2 implements TennisGame
{
    private Score2 score = new EqualScore(0, 0);
	private String player1Name;
	
    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
    }

    public void wonPoint(String player) {
    	if (player == player1Name)
    		score = score.increasePlayer1Score();
    	else
    		score = score.increasePlayer2Score();
    }

    public String getScore(){
    	return score.getScore();
    }
}