public class DoWhileLoop {
    public static void main(String[] args) {


        // do...while : execute at least once, then check the condition, loop as long as it is true
        int y=0;
        do {
            System.out.print("value of y :" + y);

            y++;
            System.out.print("\n");
        } while (y<20);
    }
}
