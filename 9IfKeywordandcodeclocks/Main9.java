public class Main9 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // if (score == 5000) {
        //     System.out.println("Your score was "+  score);
        // } else {
        //     System.out.println("Your score was not 5000, continue.");
        // }

            if(gameOver){
                int finalScore = score + (levelCompleted * bonus);
                System.out.println("Your Score was " + finalScore);
            }
            

    }
}