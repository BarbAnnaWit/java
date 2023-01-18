import java.util.Scanner;

public class UserInputExample {
    public static void main (String[] args){
        // this program can read user name and age
        //create object scanner
        Scanner myObj = new Scanner(System.in);
        // read user name
        System.out.println("Enter the user name:");
        String name = myObj.nextLine();

        System.out.println("Enter user age : ");
        int age = myObj.nextInt();

        System.out.println("user name is" + name);
        System.out.println("user age is" + age);

    }
}
