import java.util.Random;

public class MathMethods {

    int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    int multiplication(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    double division(int firstNumber, int secondNumber){
        return (firstNumber * 1.0) / (secondNumber * 1.0);
    }

    int randomNumber(){
        Random rand = new Random();
        return rand.nextInt(0,1000);
    }
}
