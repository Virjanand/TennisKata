package score;

public class Regular extends Score2 {
    public Regular(int p1point, int p2point) {
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
        if (isDeuce()) {
            return new Deuce(getP1point(), getP2point());
        }
        if (isWinPlayer(getP1point(), getP2point())){
            return new Win(getP1point(), getP2point());
        }
        if (isWinPlayer(getP2point(), getP1point())){
            return new Win(getP1point(), getP2point());
        }
        return this;
    }

    private boolean isWinPlayer(int p1point, int p2point) {
        return p1point>=4 && Math.abs(p1point-p2point)>=2;
    }

    private boolean isDeuce() {
        return isEqualScore() && getP1point()>=3;
    }

    private boolean isEqualScore() {
        return getP1point() == getP2point();
    }
}
