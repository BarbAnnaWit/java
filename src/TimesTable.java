import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create Scanner object

        System.out.println("time table reading");
        int timesTable = reader.nextInt();

        System.out.println("run the time table...");
        // print out, "What times table would you like to make ?"

        System.out.println("I want to run the"+ timesTable + "timesTable");

        for (int counter=1;counter <=12; counter ++ ){
            // use for loop, counter from 1 to 12, incrementing
            System.out.println( counter + "x" + timesTable +"="+ counter* timesTable);
            // inside the loop, print the times table and calculate timesTable * count
        }






        // read the user input, save inside variable "timesTable", read using .nextInt()





    }
}
