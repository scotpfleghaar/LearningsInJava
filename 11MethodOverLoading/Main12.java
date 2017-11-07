//The switch Statement
public class Main12 {
    public static void main(String[] args) {
        int value = 1;
//        if (value == 1){
//            System.out.println("The number is 1");
//        }

        switch (value) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4: case 5: case 6:
                System.out.println("Case 4, 5, 6");
                break;
            default:
                System.out.println("Default");
        }
    }
}

