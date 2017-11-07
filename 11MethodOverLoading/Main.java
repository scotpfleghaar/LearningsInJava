public class Main {
    public static void main(String[] args) {
    //    int newScore = calculateScore("Scot", 500);
    //    System.out.println("New score "+newScore);
    // }
    // public static int calculateScore(String playerName, int score){
    //     System.out.print

    //  }
    // public static int calculateScore(int score){
    //     System.out.println("Player scored " + score + " points");
    //     return score * 1000;

        double cent = calcFeetAndInchesToCentimeters(12, 3);
        System.out.println(cent + "cm");
        

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet <= 0){
            return -1;
        } else if (inches <= 0 && inches >= 12){
            return -1;
        }
        double feetToInches = (double) (feet * 12);
        double totalInches = feetToInches + inches;
        double totalCentimeters = (double) (totalInches * 2.54);
        return totalCentimeters;

    }
    
   
}

