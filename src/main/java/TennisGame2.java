import score.Deuce;
import score.Equals;
import score.Score2;

public class TennisGame2 implements TennisGame
{
    private Score2 score = new Equals(0,0);
    private String player1Name;
    public TennisGame2(String player1Name, String player2Name) {
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
    		return "Deuce";
        if (isEqualScore())
			return convertScore(score.getP1point()) + "-All";
        if (isWinPlayer(score.getP1point(), score.getP2point()))
            return "Win for player1";
        if (isWinPlayer(score.getP2point(), score.getP1point()))
			return "Win for player2";
        if (isAdvantagePlayer(score.getP1point(), score.getP2point()))
			return "Advantage player1";
        if (isAdvantagePlayer(score.getP2point(), score.getP1point()))
			return "Advantage player2";
        
        return convertScore(score.getP1point()) + "-" + convertScore(score.getP2point());
    }

	private boolean isWinPlayer(int p1point, int p2point) {
		return p1point>=4 && (p1point-p2point)>=2;
	}

	private boolean isAdvantagePlayer(int p1point, int p2point) {
		return p1point > p2point && p2point >= 3;
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