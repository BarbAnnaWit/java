import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create Scanner object

        System.out.println("time table reading");
        int timesTable = reader.nextInt();

        System.out.println("run the time table...");


        System.out.println("I want to run the"+ timesTable + "timesTable");

        for (int counter=1;counter <=12; counter ++ ){
            System.out.println( counter + "x" + timesTable +"="+ counter* timesTable);

        }




        // print out, "What times table would you like to make ?"

        // read the user input, save inside variable "timesTable", read using .nextInt()

        // use for loop, counter from 1 to 12, incrementing

        // inside the loop, print the times table and calculate timesTable * count

    }
}
