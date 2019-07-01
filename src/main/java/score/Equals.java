package score;

public class Equals extends Score2 {
    public Equals(int p1point, int p2point) {
        super(p1point, p2point);
    }

    @Override
    public Score2 player1Scores() {
        return new Regular(getP1point()+1, getP2point());
    }

    @Override
    public Score2 player2Scores() {
        return new Regular(getP1point(), getP2point()+1);
    }
}
