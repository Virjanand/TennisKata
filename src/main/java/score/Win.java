package score;

public class Win extends Score2 {
    public Win(int p1point, int p2point) {
        super(p1point, p2point);
    }

    private boolean isWinPlayer(int p1point, int p2point) {
        return p1point>=4 && (p1point-p2point)>=2;
    }

    @Override
    public String getScore() {
        if (isWinPlayer(getP1point(), getP2point()))
            return "Win for player1";
        if (isWinPlayer(getP2point(), getP1point()))
            return "Win for player2";
        return null;
    }

}
