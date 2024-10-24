import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;
public class Room {
    private int creatureStrength;
    private int creatureHealth;
    private int creatureIntelligence;
    private int creatureDexterity;
    private int creatureAgility;
    private double creatureDamage;

    public Room(InputStream in){setCreatureHealth();
        setCreatureStrength();
        setCreatureIntelligence();
        setCreatureDexterity();
        setCreatureAgility();
        setCreatureDamage();}

    private Random rand = new Random();

    public void setCreatureHealth() {
        this.creatureHealth = rand.nextInt(201);
    }

    public void setCreatureStrength() {
        this.creatureStrength = rand.nextInt(50);
    }

    public void setCreatureIntelligence() {
        this.creatureIntelligence = rand.nextInt(50);
    }

    public void setCreatureDexterity() {
        this.creatureDexterity = rand.nextInt(50);
    }

    public void setCreatureAgility() {
        this.creatureAgility = rand.nextInt(50);
    }

    public void setCreatureDamage() {
        this.creatureDamage = (creatureStrength * 0.8) + (creatureDexterity * 0.8) +
                              (creatureAgility * 0.8) + (creatureIntelligence * 0.8);
    }

    public int getCreatureHealth() {
        return creatureHealth;
    }

    public int getCreatureStrength() {
        return creatureStrength;
    }

    public int getCreatureIntelligence() {
        return creatureIntelligence;
    }

    public int getCreatureDexterity() {
        return creatureDexterity;
    }

    public int getCreatureAgility() {
        return creatureAgility;
    }

    public double getCreatureDamage() {
        return creatureDamage;
    }

    public void Display_Info() {


        System.out.println("HP:     "+creatureHealth);
        System.out.println("STR:    "+creatureStrength);
        System.out.println("INT:    "+creatureIntelligence);
        System.out.println("DEX:    "+creatureDexterity);
        System.out.println("AG:    "+creatureAgility);
        System.out.println("DAM:    "+creatureDamage);
    }
}

