public class Number {

    
    
    public static int random() {
    int upperBound = 10;
    int lowerBound = 1;
    int range = (upperBound - lowerBound) + 1;
    int randomNum = (int)(Math.random() * range) + lowerBound; 
    return randomNum;
    }
}
