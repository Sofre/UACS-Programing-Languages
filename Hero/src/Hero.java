import java.io.InputStream;
import java.util.Scanner;

public class Hero {
    public int health;
    public int strength;
    public int intelligence;
    public int dexterity;
    public int agility;

    public String Hero_Name;
    public String Title;



    public Hero(int health, int strength, int intelligence, int dexterity, int agility,String Hero_Name,String Title) {
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.agility = agility;
        this.Hero_Name = Hero_Name;
        this.Title=Title;
    }

        public Hero(InputStream in) {
        }

    public void Display_Info()
    {

        System.out.println(health);
        System.out.println(strength);
        System.out.println(intelligence);
        System.out.println(dexterity);
        System.out.println(agility);

    }
    public void Set_Info(){
        Scanner sc = new Scanner(System.in);
        Hero_Name = sc.nextLine();
        Title = sc.nextLine();
        health = sc.nextInt();
        strength = sc.nextInt();
        intelligence = sc.nextInt();
        dexterity = sc.nextInt();
        agility = sc.nextInt();



    }



        public void setHealth(int health) {
        this.health = health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;

    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setHero_Name(String Hero_Name) {
        this.Hero_Name = Hero_Name;
    }
    public void setTitle(String spec) {
        this.Title = Title;
    }

    public String getHero_Name() {
        return Hero_Name;
    }

    public String getTitle() {
        return Title;
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







}
