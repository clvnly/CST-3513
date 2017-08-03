class DoublesTennisGame extends TennisGame{
    String player3, player4;

    public void setPlayers(String a, String b, String c, String d){
        super.setPlayers(a,b);
        setPlayer3(c);
        setPlayer4(d);
    }
    public void setPlayer3(String a){
        player3 = a;
    }
    public void setPlayer4(String a){
        player4 = a;
    }
    public String getPlayer3(){
        return player3;
    }
    public String getPlayer4(){
        return player4;
    }
        @Override
        public String toString(){
            return String.format( "%s and %s and %s and %s\n%s: %s to %s\n%s: %s to %s",
                    player1,player2,player3,player4,
                    "Score", finalscore1, finalscore2,
                    "Score", scoreString1, scoreString2);
        }
}
