import java.lang.Math; // Import Math Method

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double legC = (legA)^2 + (legB)^2;       //Double leg values
        double squareRoot = Math.sqrt(legC);     //Square Root the SUM of LEGC
        return squareRoot;         // Return the result
    }
}