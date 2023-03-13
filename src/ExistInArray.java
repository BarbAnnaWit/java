import java.util.Scanner;
public class ExistInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = {8,5,15,9,2,33};
        System.out.println("Guess my number");
        int userNum = scanner.nextInt();
        boolean isFound = false;

        for (int i=0; i<numbers.length; i++) {
            if (userNum == numbers[i]){
                isFound = true;
            }
        }

        System.out.println("Your guess is found in the array ? " + isFound);
    }


        }



