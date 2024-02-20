import java.util.Random;

public class MathMethods {

    // static int dropCounter = 0;

    public int addition(int firstNumber, int secondNumber){

        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber){

        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber){

        return firstNumber * secondNumber;
    }

    public double division(int firstNumber, int secondNumber){

        return (firstNumber * 1.0) / (secondNumber * 1.0);
    }

    public int randomNumberWhole(int origin, int bound){
        Random rand = new Random();
        return rand.nextInt(origin, bound);
    }

    public double randomNumberDecimal(double origin, double bound){

        Random rand = new Random();
        return rand.nextDouble(origin, bound);
    }
}
