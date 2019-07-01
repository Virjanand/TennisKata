package score;

public class Regular extends Score2 {
    public Regular(int p1point, int p2point) {
        super(p1point, p2point);
    }

    @Override
    public Score2 player1Scores() {
        super.player1Scores();
        if (isDeuce()) {
            return new Deuce(getP1point(), getP2point());
        }
        return this;
    }

    @Override
    public Score2 player2Scores() {
        super.player2Scores();
        if (isDeuce()) {
            return new Deuce(getP1point(), getP2point());
        }
        return this;
    }

    private boolean isDeuce() {
        return isEqualScore() && getP1point()>=3;
    }

    private boolean isEqualScore() {
        return getP1point() == getP2point();
    }
}
