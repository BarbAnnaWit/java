import java.util.Scanner;

public class AgeChecker {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = reader.nextInt();
        System.out.println("your age is" + age);

        if (age >= 18) {
            System.out.println("Accesses granted!");
        }  else if (age < 0 ) {
            System.out.println(" Enter postive number only ");
        }  else {
                    System.out.println("Access denied : (");
                }


    }
}
