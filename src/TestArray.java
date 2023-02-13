public class TestArray {

        public static void main(String[ ] args) {
            double[] myList ={1.9,2.9,3.4,3.5};
            System.out.println(myList[0]); // call the element on index 0

            // use .length to print how many data inside your array
            System.out.println(myList.length);
            System.out.println("I'm printing all the data");
            // print all elements using for loop
            for (int i=0; i < myList.length; i++) { // i is the index
                System.out.println(myList[i]);
            }
        }

    }



