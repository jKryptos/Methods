import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        MathMethods add = new MathMethods();
        MathMethods divide = new MathMethods();
        MathMethods randomNumber = new MathMethods();

        for (int i = 0; i < 5;i++) {
            int firstRand = randomNumber.randomNumber();
            int secondRand = randomNumber.randomNumber();

            //double quotient = divide.division(firstRand, secondRand);
            //System.out.printf("The quotient is: " +  "%.2f", (quotient));
            //System.out.println();

            //int sum = add.addition(firstRand, secondRand);
            //System.out.println("The sum is: " + sum);

            System.out.println("The numbers were... " + firstRand + " " + secondRand);
            UtilityMethods.whiteSpace(1);
        }
    }
}