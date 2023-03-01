/**
 * Dice Probability Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/


import java.util.Random;
import java.util.Scanner;
public class DiceProbability {
    public static void main(String[] args) {
        System.out.println("How many times would you like to roll?");
        Scanner s = new Scanner(System.in);
        int times = s.nextInt();

        int[] a = new int[13]; // creating a new array
        a[0] = 0; // setting the arrays equal to 0
        a[1] = 0;
        a[2] = 0;
        a[3] = 0;
        a[4] = 0;
        a[5] = 0;
        a[6] = 0;
        a[7] = 0;
        a[8] = 0;
        a[9] = 0;
        a[10] = 0;
        a[11] = 0;
        a[12] = 0;

        for(int i = 0; i < times; i++){ // making a for loop to roll the dice a certain amount of times
            Random r = new Random(); // creating a new random object
            int die1 = r.nextInt(6)+1; // creating a die
            int die2 = r.nextInt(6)+1; // creating another die
            int sum = die1 + die2; // adding the values together
            a[sum] = a[sum] + 1; // finding the array that corresponds with the sum and adding one to the amount of times it has been rolled
        }
        String response; // creating a new string
        do { // creating a do while loop for when the user wants to view their stats
            System.out.println("Which number would you like to see the percentage you rolled?"); // prompting the user
            int choose = s.nextInt(); // reading in the users input
            double number = choose; // casting the int to a double
            double percent = number/times * 100; // calculating the percent of times the users number was rolled
            System.out.println("You rolled a " + choose + " " + percent + "% of the time"); // printing the response
            System.out.println("Would you like to choose another roll to view? (y/n)"); // reprompting the user to choose again or quit
            s.nextLine(); // creating a throw away line
            response = s.nextLine(); // reading in the users input
        } while (response.equals("y")); // re looping if the user chooses to play again
        System.out.println("Thank you for playing!"); // ending the program
    }
}
