package Score2;

public class DeuceScore extends Score2{

	public DeuceScore(int p1point, int p2point) {
		super(p1point, p2point);
	}
	
	@Override
	public Score2 increasePlayer1Score() {
		super.increasePlayer1Score();
		return getNextScoreState();
	}
	
	@Override
	public Score2 increasePlayer2Score() {
		super.increasePlayer2Score();
		return getNextScoreState();
	}
	
	private Score2 getNextScoreState() {
		return new AdvantageScore(getP1point(), getP2point());
	}

	@Override
	public String getScore() {
		return "Deuce";
	}
}
