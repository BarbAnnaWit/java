import java.util.Scanner;
public class YesNo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Do you want to continue playing");
        String answer = obj.nextLine();

        if (!(answer.equals("Yes") || answer.equals("yes") || answer.equals("YES")))
        {
            System.out.println("The game will end here.");
        }
        else
        {
            System.out.println("Go to the next level!");
        }
    }
}
