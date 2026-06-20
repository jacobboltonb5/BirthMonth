import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a Scanner to read from the console
        // declare an int for the birth month
        // prompt for birth month (1 - 12)
        // if the input is a valid int:
        //     read the month and clear the buffer
        //     if month is 1 through 12 -> echo "Your birth month is: N"
        //     else -> "You entered an incorrect month value: N"
        // else: read the bad input as a String and show an error

        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.print("Enter your birth month (1 - 12): ");

        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();   // clear the buffer

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            trash = in.nextLine();
            System.out.println("That is not a whole number: " + trash);
            System.out.println("Run the program again and enter a value from 1 to 12!");
        }
    }
}
