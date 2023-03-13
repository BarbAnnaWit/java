public class CheckAge2 {
    // age checker  method here
    public static void checkAge(int age){ // passing on int age
        // body of the checkAge method
        if (age < 18) {
            System.out.println("Access denied.");
        } else {
            System.out.println("Access granted!");
        }
    }


    public static void main(String[] args) { //MAIN METHOD
        checkAge(15);
        checkAge(40);

        // call the method, pass on age 15 and 40
    }


}


