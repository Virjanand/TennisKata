
public class TennisGame2 implements TennisGame
{
    private int p1point = 0;
    private int p2point = 0;
    
    private String p1res = "";
    private String p2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";
        if (isEqualScore())
        {
        	score = convertScore(p1point) + "-All";
        }
        if (isDeuce())
            score = "Deuce";
        
        if (isPlayer2At0())
        {
            p1res = convertScore(p1point);
            p2res = "Love";
            score = convertScore(p1point) + "-" + p2res;
        }
        if (isPlayer1At0())
        {
            p2res = convertScore(p2point);
            p1res = "Love";
            score = p1res + "-" + p2res;
        }
        
        if (p1point>p2point && p1point < 4)
        {
            if (p1point==2)
                p1res="Thirty";
            if (p1point==3)
                p1res="Forty";
            if (p2point==1)
                p2res="Fifteen";
            if (p2point==2)
                p2res="Thirty";
            score = p1res + "-" + p2res;
        }
        if (p2point>p1point && p2point < 4)
        {
            if (p2point==2)
                p2res="Thirty";
            if (p2point==3)
                p2res="Forty";
            if (p1point==1)
                p1res="Fifteen";
            if (p1point==2)
                p1res="Thirty";
            score = p1res + "-" + p2res;
        }
        
        if (p1point > p2point && p2point >= 3)
        {
            score = "Advantage player1";
        }
        
        if (p2point > p1point && p1point >= 3)
        {
            score = "Advantage player2";
        }
        
        if (p1point>=4 && p2point>=0 && (p1point-p2point)>=2)
        {
            score = "Win for player1";
        }
        if (p2point>=4 && p1point>=0 && (p2point-p1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

	private boolean isPlayer1At0() {
		return p2point > 0 && p1point==0;
	}

	private boolean isPlayer2At0() {
		return p1point > 0 && p2point==0;
	}

	private boolean isDeuce() {
		return p1point==p2point && p1point>=3;
	}

	private String convertScore(int point) {
		if (point==0)
		    return "Love";
		if (point==1)
		    return "Fifteen";
		if (point==2)
		    return "Thirty";
		return "";
	}

	private boolean isEqualScore() {
		return p1point == p2point && p1point < 4;
	}
    
    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        p1point++;
    }
    
    public void P2Score(){
        p2point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}