import java.util.Scanner;
public class sumTo {
    public static void main(String[] args) {
        int sumTotal=0;
        //ask user to enter number

        Scanner reader = new Scanner(System.in); // scanner object
        System.out.println("Input a number to sum to :");
        int sumTo = reader.nextInt(); // read user input and remember it
        System.out.println("You've entered " + sumTo);

        // use while loop to calculate the total
        int counter = 1;
        while(counter <= sumTo) { // 1 - 2- 3----23
            sumTotal = sumTotal + counter;
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        System.out.println("The sum total is " + sumTotal);

    }
}
