public class App {
    public static void main(String[] args) throws Exception {

        int tryLeft = 3;

        while (true) {

        int x = UserInput.userNumber();
        int y = Number.random();

        if (x == y) {
            System.out.println("This is a random number and you guessed it!!!!!!!!");
            break;
            } else if (tryLeft == 1) {
                System.out.println("Game over!");
                break;
            } else {
            System.out.println("Nope! the number was: " + y);
            tryLeft--;
            System.out.println(tryLeft + " tries left");
            }
        }
    }
}
