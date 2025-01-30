import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner userInput = new Scanner(System.in);

        int score = 0;

        while(score < 15){
            int randomNumber = random.nextInt(10);
            System.out.println("Guess the number");
            int number = userInput.nextInt();

            //this below checks if the number is equal to randomNumber
            if(number == randomNumber){
                score += number;
                System.out.println("You guessed the right number");
                System.out.println("The number was indeed " + randomNumber);
                System.out.println("Score = "+ score);
                if(score > 10){
                    System.out.println("You have won .You have beaten the game");
                    break;
                }
            }else{
                score = score - randomNumber;
                System.out.println("")
            }
            
        }
    }
}
