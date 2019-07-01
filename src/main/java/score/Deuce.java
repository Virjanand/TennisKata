package score;

public class Deuce extends Score2 {

    public Deuce(int p1point, int p2point) {
        super(p1point, p2point);
    }

    @Override
    public Score2 player1Scores() {
        super.player1Scores();
        return new Advantage(getP1point(), getP2point());
    }

    @Override
    public Score2 player2Scores() {
        super.player2Scores();
        return new Advantage(getP1point(), getP2point());
    }
}
