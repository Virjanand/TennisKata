package Score2;

public class WinScore extends Score2{

	public WinScore(int p1point, int p2point) {
		super(p1point, p2point);
	}

	@Override
	public String getScore() {
		return getP1point() > getP2point() ? "Win for player1": "Win for player2";
	}
}
