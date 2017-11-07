public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculate.calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        highScore = calculate.calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Scot", Integer.toString(calculateHighScore(1500)));

    }

    public static void displayHighScorePosition(String name, String position) {
        System.out.println(name + " managed to get into postition " + (String) position + " on the high score table.");
    }

    public static int calculateHighScore(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}