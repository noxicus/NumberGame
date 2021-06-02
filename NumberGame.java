import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100) + 1;

        System.out.println("I have selected random number between 1-100.");
        System.out.println("Please try to guess it, you have 10 attempts: ");


        for (int i = 9; i >= 0; i--) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input < randomNum) {
                System.out.println("Number is higher then " + input + ". Attempts left " + i);
            } else if (input > randomNum) {
                System.out.println("Number is lower then " + input + ". Attempts left " + i);
            } else {
                System.out.println("It's correct! ");
                break;
            }
            if (i == 0)
                System.out.println("You lose, better luck next time");
        }
    }
}
