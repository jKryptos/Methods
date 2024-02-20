public class Main {

    public static void main(String[] args) {

        //MathMethods add = new MathMethods();
        //MathMethods subtract = new MathMethods();
        //MathMethods divide = new MathMethods();
        //MathMethods multiply = new MathMethods();
        MathMethods randomNumber = new MathMethods();
        //UtilityMethods itemDrop = new UtilityMethods();

        for (int i = 0; i < 5;i++) {

            Monster basicMonster = new Monster("Basic Monster", randomNumber.randomNumberOneThousand(), 99, randomNumber.randomNumberStartingStatsMaxTwenty(), randomNumber.randomNumberStartingStatsMaxTwenty(), randomNumber.randomNumberStartingStatsMaxTwenty(), randomNumber.randomNumberStartingStatsMaxTwenty(),randomNumber.randomNumberStartingStatsMaxTwenty());

            String basicMob = basicMonster.printMob();
            double damage = basicMonster.damageDealt();
            System.out.println(basicMob);
            System.out.print("Total Damage: ");
            System.out.println(damage);

            //int firstRand = randomNumber.randomNumberTenThousand();
            //int secondRand = randomNumber.randomNumberTenThousand();

            //double quotient = divide.division(firstRand, secondRand);
            //System.out.printf("The quotient is... " +  "%.2f", (quotient));
            //System.out.println();

            //int sum = add.addition(firstRand, secondRand);
            //System.out.println("The sum is... " + sum);

            //int difference = subtract.subtraction(firstRand, secondRand);
            //System.out.println("The difference is... " + difference);

            //int product = multiply.multiplication(firstRand,secondRand);
            //System.out.println("The product is... " + product);

            //boolean cardDrop = itemDrop.dropYesOrNo(1);
            //System.out.println(cardDrop);

            //System.out.println("The numbers were... " + firstRand + " and " + secondRand);
            UtilityMethods.whiteSpace(1);
        }
        //System.out.println("Total cards dropped: " + UtilityMethods.dropCounter);
    }
}