
    import java.util.Random;

    public class CrazyDiceProgram {
        public static void main(String[] args) {
            // create an instance/object of the random
            Random random = new Random();

            int diceNumber = random.nextInt(12)+1;

            System.out.println("The dice number is " + diceNumber);
        }
    }


