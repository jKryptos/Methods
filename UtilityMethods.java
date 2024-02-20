public class UtilityMethods {

    MathMethods random = new MathMethods();

    static int dropCounter = 0;

    public static void whiteSpace(int counter) {

        for (int i = 0; i < counter; i++) {
            System.out.println(" ");
        }
    }

    public boolean dropYesOrNo(int dropRate){

        boolean drop = true;

        dropRate = dropRate - random.randomNumberWhole(1,10001);
        if(dropRate < 0){
            drop = false;
        } else {
            dropCounter++;
            System.out.println("-----------------You have found an item!-----------------");
        }
        return drop;
    }
}