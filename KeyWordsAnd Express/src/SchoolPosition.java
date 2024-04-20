public class SchoolPosition {
    public static void main(String[] args) {

        int playerScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playerScorePosition);

    }

   public static void displayHighScorePosition(String playerName, int playerScorePosition){
        System.out.println(playerName+" is position "+ playerScorePosition );
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000) {
           return 1;
        }else if(score >= 500 && score < 1000){
            return  2;
        }else if(score >= 100 && score < 500){
            return 3;
        }else {
            return 4;
        }
    }
}
