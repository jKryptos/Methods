public class Monster {

    MathMethods random = new MathMethods();

    private String name;
    private int healthPoints;
    private int strength;
    private int vitality;
    private int agility;
    private int dexterity;
    private int intelligence;
    private int luck;
    private int accuracy;
    private double baseDamage;


    public Monster(String name, int healthPoints, int strength, int vitality, int agility, int dexterity, int intelligence, int luck){

        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.vitality = vitality;
        this.agility = agility;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.luck = luck;
        this.accuracy = 50 + (this.dexterity * 7 / 3 / 2) + 8;
        this.baseDamage = 5 + (this.strength * 50) * random.randomNumberDecimal(.025,.035);
    }

    public Monster(){

    }

    public String printMob(){

        return ("Name: " + this.name + "\nHealth: " + this.healthPoints + "\nStrength: " + this.strength + "\nVitality: " + this.vitality + "\nAgility: " + this.agility + "\nDexterity: " + this.dexterity + "\nIntelligence: " + this.intelligence + "\nLuck: " + this.luck + "\nAccuracy: " + this.accuracy + "\nBase Damage: " + this.baseDamage);
    }
}
