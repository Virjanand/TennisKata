package score;

public class Advantage extends Score2 {
    public Advantage(int p1point, int p2point) {
        super(p1point, p2point);
    }

    @Override
    public Score2 player1Scores() {
        super.player1Scores();
        if (isWinPlayer(getP1point(), getP2point())) {
            return new Win(getP1point(), getP2point());
        }
        return new Deuce(getP1point(), getP2point());
    }

    @Override
    public Score2 player2Scores() {
        super.player2Scores();
        if (isWinPlayer(getP1point(), getP2point())) {
            return new Win(getP1point(), getP2point());
        }
        return new Deuce(getP1point(), getP2point());
    }

    private boolean isWinPlayer(int p1point, int p2point) {
        return p1point>=4 && (p1point-p2point)>=2;
    }

}
