import java.io.InputStream;
import java.util.Scanner;

public class Hero_V2  {
        private int health;
        private int strength;
        private int intelligence;
        private int dexterity;
        private int agility;
        private double damage;

        private String heroName;



        public Hero_V2(InputStream in) {
            setHealth(health);
            setStrength(strength);
            setIntelligence(intelligence);
            setDexterity(dexterity);
            setAgility(agility);
            setDamage(damage);

        }



        public void setHealth(int health) {
            this.health = health;
        }

        public void setStrength(int strength){
            this.strength = strength;
        }
        public void setIntelligence(int intelligence){
            this.intelligence = intelligence;
        }
        public void setDexterity(int dexterity){
            this.dexterity = dexterity;

        }
        public void setAgility(int agility){
            this.agility = agility;

        }
        public void setDamage(double damage){
            this.damage = damage;
        }

        public int getHealth() {
            return health;
        }
        public double getDamage() {
            return damage;
        }

    public void setHeroName() {

       Scanner scanner = new Scanner(System.in);
       this.heroName = scanner.nextLine();
    }

    public String getHeroName() {
        return heroName;
    }





    public void Display_Info() {
            System.out.println("HP:  "+ health);
            System.out.println("STR: " + strength);
            System.out.println("INT: " + intelligence);
            System.out.println("DEX: " + dexterity);
            System.out.println("AG: " + agility);
            System.out.println("DMG: " + damage);
        }


}

