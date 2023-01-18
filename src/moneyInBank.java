import java.util.Scanner;
public class moneyInBank {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Is number between 500 AND 50000");

        int number = reader.nextInt();
        if (number  > 500 && number < 50000) {
            System.out.println("Pay out!: ) ");
        } else {
            {
                System.out.println(" don't pay out!:)");
            }

        }
    }
}