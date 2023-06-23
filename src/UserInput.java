import java.util.Scanner;

public class UserInput {

    public static int userNumber() {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter number between 1 and 10: ");
        
        int userNumber = myObj.nextInt();
        return userNumber;
    }

}
