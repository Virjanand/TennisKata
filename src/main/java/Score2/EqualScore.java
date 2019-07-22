package Score2;

public class EqualScore extends Score2{

	public EqualScore(int p1point, int p2point) {
		super(p1point, p2point);
	}
	
	@Override
	public Score2 increasePlayer1Score() {
		super.increasePlayer1Score();
		return setNextScoreState();
	}
	
	@Override
	public Score2 increasePlayer2Score() {
		super.increasePlayer2Score();
		return setNextScoreState();
	}

	private Score2 setNextScoreState() {
		if (isAdvantagePlayer(getP1point(), getP2point()))
			return new AdvantageScore(getP1point(), getP2point());
		else
			return new DifferenceScore(getP1point(), getP2point());
	}
	
	@Override
	public String getScore() {
		return convertScore(getP1point()) + "-All";
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
	
	private boolean isAdvantagePlayer(int p1point, int p2point) {
		return isEndGame(p1point, p2point) && Math.abs(p1point-p2point)>=1;
	}
	
	private boolean isEndGame(int p1point, int p2point) {
		return p1point>=4 || p2point >=4;
	}
}
