import java.util.Scanner;
public class ifElse {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the bedroom number");
        int bedroomNum = reader.nextInt();

        if (bedroomNum < 6 && bedroomNum >= 3 ) {
            System.out.println("The flat is big enough");
        } else {
            System.out.println("The flat is to small");
        }
    }
}
