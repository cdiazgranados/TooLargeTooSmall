/**
 * Created by iyasuwatts on 10/17/17.
 */

//add scanner library (disapearing... It optimized???)
//import Random class
import java.util.Random;

//import Scanner class
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //initialize mystery number
        // with the Random class
        Random random = new Random();
        int randomNum = random.nextInt(11);

        //initialize guess incrementer
        int i = 0;

        //initialize user prompt and loop through until the answer is correct
        int userNum;

        do {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Guess a number between 0 and 10: ");
            userNum = myObj.nextInt();

            //if too large
            if (randomNum < userNum) {
                System.out.println("Your guess is too high");
            } else if (randomNum > userNum) {
                //else too small
                System.out.println("Your guess is too low");
            }

            //add to guess incrementer
            i++;
            System.out.println("You have guessed this many times so far: " + i);

        } while (userNum != randomNum);

            //correct guess and log a congrats message and the number of guesses
            System.out.println("Congrats you guessed correctly! The mystery number was " + randomNum);

    }
}
