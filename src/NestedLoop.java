public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println(i + "" + j);
            }
        }
    }
}