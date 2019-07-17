package score;

public class Advantage extends Score2 {
    public Advantage(int p1point, int p2point) {
        super(p1point, p2point);
    }

    @Override
    public Score2 player1Scores() {
        super.player1Scores();
        return decideNextState();
    }

    @Override
    public Score2 player2Scores() {
        super.player2Scores();
        return decideNextState();
    }

    private Score2 decideNextState() {
        if (isWinPlayer(getP1point(), getP2point())) {
            return new Win(getP1point(), getP2point());
        }
        return new Deuce(getP1point(), getP2point());
    }

    private boolean isWinPlayer(int p1point, int p2point) {
        return p1point>=4 && Math.abs(p1point-p2point)>=2;
    }

    private boolean isAdvantagePlayer(int p1point, int p2point) {
        return p1point > p2point && p2point >= 3;
    }

    @Override
    public String getScore() {
        if (isAdvantagePlayer(getP1point(), getP2point())) {
            return "Advantage player1";
        }
        if (isAdvantagePlayer(getP2point(), getP1point())) {
            return "Advantage player2";
        }
        throw new IllegalStateException();
    }
}
