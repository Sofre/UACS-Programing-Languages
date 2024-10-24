import java.io.InputStream;
import java.util.Scanner;
import java.util.Random;

public class Hero {
    private int health;
    private int strength;
    private int intelligence;
    private int dexterity;
    private int agility;
    private double damage;

    private String heroName;
    private String title;


    public Hero(InputStream in) {
        setHealth();
        setStrength();
        setIntelligence();
        setDexterity();
        setAgility();
        setDamage();
    }

    private Random rand = new Random();

    public void setHealth() {
        this.health = 100;
    }

    public void setStrength() {
        this.strength = rand.nextInt(101);
    }

    public void setIntelligence() {
        this.intelligence = rand.nextInt(101);
    }

    public void setDexterity() {
        this.dexterity = rand.nextInt(101);
    }

    public void setAgility() {
        this.agility = rand.nextInt(101);
    }

    public void setDamage() {
        this.damage = (strength * 1.5) + (dexterity * 1.2) + (agility * 1.1) + (intelligence * 0.8);
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public double getDamage() {
        return damage;
    }

    public void Display_Info() {
        System.out.println(health);
        System.out.println("STR: " + strength);
        System.out.println("INT: " + intelligence);
        System.out.println("DEX: " + dexterity);
        System.out.println("AGI: " + agility);
        System.out.println("DMG: " + damage);
    }

}