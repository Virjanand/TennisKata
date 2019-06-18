
public class TennisGame2 implements TennisGame
{
    private int p1point = 0;
    private int p2point = 0;
    
    private String player1Name;
    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
    }

    public void wonPoint(String player) {
    	if (player == player1Name)
    		p1point++;
    	else
    		p2point++;
    }

    public String getScore(){
    	if (isDeuce())
    		return "Deuce";
        if (isEqualScore())
			return convertScore(p1point) + "-All";
        if (isWinPlayer(p1point, p2point))
            return "Win for player1";
        if (isWinPlayer(p2point, p1point))
			return "Win for player2";
        if (isAdvantagePlayer(p1point, p2point))
			return "Advantage player1";
        if (isAdvantagePlayer(p2point, p1point))
			return "Advantage player2";
        
        return convertScore(p1point) + "-" + convertScore(p2point);
    }

	private boolean isWinPlayer(int p1point, int p2point) {
		return p1point>=4 && (p1point-p2point)>=2;
	}

	private boolean isAdvantagePlayer(int p1point, int p2point) {
		return p1point > p2point && p2point >= 3;
	}

	private boolean isDeuce() {
		return isEqualScore() && p1point>=3;
	}
	
	private boolean isEqualScore() {
		return p1point == p2point;
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