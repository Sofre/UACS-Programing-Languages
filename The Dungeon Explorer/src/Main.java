
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
// https://github.com/Sofre



    public static void Chose_Specialization(Hero_V2 hero)  {
        Specialization spec = new Specialization(System.in);

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your Hero's class (Ranger, Warrior, Mage, Warlock, Priest, Paladin): ");
        String choice = sc.nextLine();

        switch (choice.toLowerCase()) {

            case "ranger":
                Specialization.Ranger ranger = new Specialization.Ranger(System.in);
                hero.setHealth(ranger.getHealth());
                hero.setStrength(ranger.getStrength());
                hero.setIntelligence(ranger.getIntelligence());
                hero.setAgility(ranger.getAgility());
                hero.setDexterity(ranger.getDexterity());
                hero.setDamage(ranger.getDamage());
                System.out.println("You have chosen the  Ranger class:     ");
                System.out.println("Stats:     ");
                hero.Display_Info();

                break;

            case "warrior":
                Specialization.Warrior warrior = new Specialization.Warrior(System.in);
                hero.setHealth(warrior.getHealth());
                hero.setStrength(warrior.getStrength());
                hero.setIntelligence(warrior.getIntelligence());
                hero.setAgility(warrior.getAgility());
                hero.setDexterity(warrior.getDexterity());
                hero.setDamage(warrior.getDamage());





                System.out.println("You have chosen the  Warrior class:     ");
                System.out.println("Stats:     ");
                hero.Display_Info();


                break;

            case "mage":
                Specialization.Mage mage = new Specialization.Mage(System.in);
                hero.setHealth(mage.getHealth());
                hero.setStrength(mage.getStrength());
                hero.setIntelligence(mage.getIntelligence());
                hero.setAgility(mage.getAgility());
                hero.setDexterity(mage.getDexterity());
                hero.setDamage(mage.getDamage());

                System.out.println("You have chosen the  Mage class:     ");
                System.out.println("Stats:     ");
                ;
                break;

            case "warlock":
                Specialization.Warlock warlock = new Specialization.Warlock(System.in);
                hero.setHealth(warlock.getHealth());
                hero.setStrength(warlock.getStrength());
                hero.setIntelligence(warlock.getIntelligence());
                hero.setAgility(warlock.getAgility());
                hero.setDexterity(warlock.getDexterity());
                hero.setDamage(warlock.getDamage());

                System.out.println("You have chosen the  Warlock class:     ");
                System.out.println("Stats:     ");
                hero.Display_Info();
                break;


            case "priest":
                Specialization.Priest priest = new Specialization.Priest(System.in);
                hero.setHealth(priest.getHealth());
                hero.setStrength(priest.getStrength());
                hero.setIntelligence(priest.getIntelligence());
                hero.setAgility(priest.getAgility());
                hero.setDexterity(priest.getDexterity());
                hero.setDamage(priest.getDamage());

                System.out.println("You have chosen the  Priest class:     ");
                System.out.println("Stats:     ");
                hero.Display_Info();
                break;


            case "paladin":
                Specialization.Paladin paladin = new Specialization.Paladin(System.in);
                hero.setHealth(paladin.getHealth());
                hero.setStrength(paladin.getStrength());
                hero.setIntelligence(paladin.getIntelligence());
                hero.setAgility(paladin.getAgility());
                hero.setDexterity(paladin.getDexterity());
                hero.setDamage(paladin.getDamage());

                System.out.println("You have chosen the  Paladin class:     ");
                System.out.println("Stats:     ");
                hero.Display_Info();
                break;


        }

        sc.close();
    }


    public static boolean Fight(Hero_V2 hero, Room creature) {
        Scanner sc = new Scanner(System.in);



        int heroHealth = hero.getHealth();
        int creatureHealth = creature.getCreatureHealth();

        System.out.println("A wild creature appears! Prepare for battle!");

        System.out.println(heroHealth);
        System.out.println(creatureHealth);

        while (heroHealth > 0 && creatureHealth > 0) {
            System.out.println("Your health: " + heroHealth);
            System.out.println("Creature's health: " + creatureHealth);


            System.out.println("You attack the creature!");
            creatureHealth -= (int) hero.getDamage();


            if (creatureHealth <= 0) {
                System.out.println("You have defeated the creature!");
                hero.setHealth(heroHealth);
                return true;

            }


            System.out.println("The creature attacks you!");
            heroHealth -= (int) creature.getCreatureDamage();

            if (heroHealth <= 0) {
                System.out.println("You have been defeated by the creature!");
                return false;
            }

        }

        return false;
    }

    public static void main(String[] args) {


        Room[] creatures = new Room[3];
        Hero_V2 hero = new Hero_V2(System.in);
        



        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Dungeon Explorer");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in Start to Start: ");
        System.out.println("Type in Exit to Exit:   ");
        String choice = sc.nextLine().toLowerCase();


            if (choice.equals("start")) {
                System.out.println("Enter your hero name: ");
                hero.setHeroName();
                Chose_Specialization(hero);

                for (int i = 0; i < creatures.length; i++) {
                    creatures[i] = new Room(System.in);
                    System.out.println("Creature: " + (i + 1));
                    creatures[i].Display_Info();
                    System.out.println();

                    boolean Hero_Won = Fight(hero,creatures[i]);

                    if(Hero_Won){
                        System.out.println("Congratulations! You have won the battle against Creature " + (i + 1));
                        continue;
                    }
                    else{
                        System.out.println("You lost against Creature " + (i + 1) + ". Game Over.");
                        break; }
                }

            } else if (choice.equals("exit")) {
                System.out.println("Screen Off");
            } else {
                System.out.println("Invalid input. Please type 'start' or 'exit'.");
            }

        sc.close();
        System.out.println();








        System.out.println("Screen OFF");


    }
}
