package Score2;

public abstract class Score2 {
	private int p1point;
	private int p2point;

	public Score2(int p1point, int p2point) {
		this.p1point = p1point;
		this.p2point = p2point;
	}

	public int getP1point() {
		return p1point;
	}

	public Score2 increasePlayer1Score() {
		this.p1point++;
		return this;
	}

	public int getP2point() {
		return p2point;
	}

	public Score2 increasePlayer2Score() {
		this.p2point++;
		return this;
	}
	
	public abstract String getScore();
}