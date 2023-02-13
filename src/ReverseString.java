import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter String to reverse");
        Scanner reader = new Scanner(System.in);
        //String array called letters
        String [] Letters = {"a","b","c","d"};


         Letters [0]="a";
         Letters [1]="b";
         Letters [2]="c";
         Letters [3]="d";
         String str = reader.nextLine();
        System.out.println(Letters.length);
         String reverse="";


        for (int i= str.length() -1; i>=0; i --)  {
            reverse=reverse + str.charAt(i);
        }
        System.out.println("Reversed string is:");
        System.out.println(reverse);


    }
}
