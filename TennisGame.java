public class TennisGame {
    String player1,player2,scoreString1, scoreString2;
    int finalscore1, finalscore2;
    public String getPlayer1(){
        return player1;
    }
    public String getPlayer2(){
        return player2;
    }
    public String getScore1(){
        return scoreString1;
    }
    public String getScore2(){
        return scoreString2;
    }
    public int getFinalscore1(){
        return finalscore1;
    }
    public int getFinalscore2(){
        return finalscore2;
    }
    public void setPlayers(String a, String b){
        player1 = a;
        player2 = b;
    }
    public void setScore(int a, int b) {
        if (a < 0 || a > 4 || b < 0 || b > 4) {
            finalscore1 = 0;
            finalscore2 = 0;
            scoreString1 = "Error";
            scoreString2 = "Error";
        }
        else {
            finalscore1 = a;
            if (finalscore1 == 0){
                scoreString1 = "Love";
            }
            if (finalscore1 == 1){
                scoreString1 = "15";
            }
            if (finalscore1 == 2){
                scoreString1 = "30";
            }
            if (finalscore1 == 3){
                scoreString1 = "40";
            }
            if (finalscore1 == 4){
                scoreString1 = "Game";
            }
            finalscore2 = b;
            if (finalscore2 == 0) {
                scoreString2 = "Love";
            }
            if (finalscore2 == 1) {
                scoreString2 = "15";
            }
            if (finalscore2 == 2) {
                scoreString2 = "30";
            }
            if (finalscore2 == 3) {
                scoreString2 = "40";
            }
            if (finalscore2 == 4) {
                scoreString2 = "Game";
            }
        }
    }
    public String toString(){
        return String.format( "%s vs %s\n%s: %s to %s\n%s: %s to %s",
                player1,player2,
                "Score", finalscore1, finalscore2,
                "Score", scoreString1, scoreString2);
    }
}