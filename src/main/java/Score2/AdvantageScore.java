package Score2;

public class AdvantageScore extends Score2 {

	public AdvantageScore(int p1point, int p2point) {
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
		if (isEqualScore())
			return new DeuceScore(getP1point(),getP2point());
		else 
			return new WinScore(getP1point(), getP2point());
	}

	@Override
	public String getScore() {
		return getP1point() > getP2point() ? "Advantage player1": "Advantage player2";
	}

	private boolean isEqualScore() {
		return getP1point() == getP2point();
	}
}
