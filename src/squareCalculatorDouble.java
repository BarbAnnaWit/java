import java.util.Scanner;
public class squareCalculatorDouble { //class
    public static void main(String[]args) { //main method

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter width and height to calculate perimeter and area of a rectangle ");

        System.out.println("Enter the width : ");
        double width = reader.nextDouble();

        System.out.println("Enter the length : ");
        double length = reader.nextDouble();

        //System.out.println("The width of the rectangle is " + width);
        // System.out.println("The length of the rectangle is " + length);

        // create variable perimeter
        double perimeter = 2 * (width + length); // 2L + 2W
        System.out.println("The perimeter of the rectangle is " + perimeter);

        double area = width * length;
        System.out.println("The area of the rectangle is " + area);

    }
}
