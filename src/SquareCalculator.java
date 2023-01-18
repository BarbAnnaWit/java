public class SquareCalculator {
    public static void  main(String[] args) {
        //declare variable width and length
        // assign value width : 13.5 and height: 25.3
        double width = 13.5;
        double length = 25.3;
        System.out.println("the width of the rectangle is " + width);
        System.out.println("the length of the rectangle is " + length);
        //create variable perimeter
        double perimeter = 2 * (width + length);
        System.out.println("The perimeter of the rectangle is " + perimeter);

        double area = width * length;
        System.out.println("The area of the rectangle is " + area);
    }
}
