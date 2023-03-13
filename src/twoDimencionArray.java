public class twoDimencionArray {
    public static void main(String[] args) {
        // create 2D array
        int [][] grades = { {80, 95, 70} , {65, 100,80}};

        // print all elements
        for (int i=0; i < grades.length; i++) { // to access row
            for (int j=0; j < grades[i].length; j++) { // to access col
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }

        //longer way of writing arrays
        //grades[0][0] = 80;
        //grades[0][1] = 95;
        //grades[0][2] = 70;

        //grades[1][0] = 65;
        //grades[1][1] = 100;
        //grades[1][2] = 80;




        // extension: create an array to record student's first name and last name, you will have 2 columns in this case
        // data of dummy students names are : Harry Potter, Ron Weasley, Ginny Weasley, Hermione Granger
        String [][] names = {{"Harry", "Potter"}, {"Ron", "Weasley"}, {"Ginny", "Weasley"}, {"Hermione", "Granger"}};
        for (int i=0; i < names.length; i++) { // to access row
            for (int j=0; j < names[i].length; j++) { // to access col
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}