import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner( System.in);
        System.out.println("Input a number to sum to");
        int SumTotal = 0;
        int user = reader.nextInt();
        int counter = 1;
        while ( counter<= user ){
            SumTotal = (SumTotal+ counter);
            counter++;
            System.out.println(SumTotal);
        }
    }
}
