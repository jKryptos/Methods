import java.util.Random;

public class MathMethods {

    static int dropCounter = 0;

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

    public int randomNumber(){
        Random rand = new Random();
        return rand.nextInt(1,10000);
    }
    public boolean dropYesOrNo(int dropRate){

        boolean drop = true;

        dropRate = dropRate - randomNumber();
            if(dropRate < 0){
                drop = false;
            } else {
                dropCounter++;
                System.out.println("-----------------You have found a card!-----------------");
            }
        return drop;
    }
}
