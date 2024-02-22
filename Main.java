public class Main {

    public static void main(String[] args) {

        //MathMethods add = new MathMethods();
        //MathMethods subtract = new MathMethods();
        //MathMethods divide = new MathMethods();
        //MathMethods multiply = new MathMethods();
        //MathMethods randomNumber = new MathMethods();
        UtilityMethods itemDrop = new UtilityMethods();
        Monster monster = new Monster();

        for (int i = 0; i < 1000000;i++) {
            

            //int firstRand = randomNumber.randomNumberWhole(1, 10001);
            //int secondRand = randomNumber.randomNumberWhole(1, 10001);

            //double quotient = divide.division(firstRand, secondRand);
            //System.out.printf("The quotient is... " +  "%.2f", (quotient));
            //System.out.println();

            //int sum = add.addition(firstRand, secondRand);
            //System.out.println("The sum is... " + sum);

            //int difference = subtract.subtraction(firstRand, secondRand);
            //System.out.println("The difference is... " + difference);

            //int product = multiply.multiplication(firstRand,secondRand);
            //System.out.println("The product is... " + product);

            boolean cardDrop = itemDrop.dropYesOrNo(1);
            System.out.println(cardDrop);

            //System.out.println("The numbers were... " + firstRand + " and " + secondRand);
            //UtilityMethods.whiteSpace(1);
        }
        System.out.println("Total cards dropped: " + UtilityMethods.dropCounter);
    }
}