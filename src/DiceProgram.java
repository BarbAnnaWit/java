import java.util.Random;
public class DiceProgram {
    public static void main(String[] args) {
        //random object
        Random random = new Random();
        int diceNumber = random.nextInt(6)+1;

        System.out.println("The dice number is" + diceNumber);
    }
}
