import score.Advantage;
import score.Deuce;
import score.Equals;
import score.Score2;
import score.Win;

public class TennisGame2 implements TennisGame
{
    private Score2 score = new Equals(0,0);
    private String player1Name;
    TennisGame2(String player1Name) {
        this.player1Name = player1Name;
    }

    public void wonPoint(String player) {
    	if (player == player1Name)
    		score = score.player1Scores();
    	else
    		score = score.player2Scores();
    }

    public String getScore(){
    	if (score instanceof Deuce)
    		return score.getScore();
        if (score instanceof Equals)
			return convertScore(score.getP1point()) + "-All";
        if(score instanceof Win){
        	return score.getScore();
		}
        if (score instanceof Advantage){
        	return score.getScore();
		}
        return convertScore(score.getP1point()) + "-" + convertScore(score.getP2point());
    }

	private boolean isEqualScore() {
		return score.getP1point() == score.getP2point();
	}

	private String convertScore(int point) {
		if (point==0)
		    return "Love";
		if (point==1)
		    return "Fifteen";
		if (point==2)
		    return "Thirty";
		if (point==3)
			return "Forty";
		return "";
	}
    
}