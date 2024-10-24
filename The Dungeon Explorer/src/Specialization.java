import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
public class Specialization {

    public Specialization(InputStream in) {}


    static class Ranger {
            Random rand = new Random();
            private int health;
            private int strength;
            private int intelligence;
            private int dexterity;
            private int agility;
            private double damage;


            public Ranger(InputStream in) {
                setHealth();
                setStrength();
                setIntelligence();
                setDexterity();
                setAgility();
                setDamage();

            }

            public void setHealth() {
                int min = 80;
                int max = 120;
                this.health = min + rand.nextInt(max-min+1);
            }

            public void setStrength() {
                int min = 10;
                int max = 15;
                this.strength = min + rand.nextInt(max-min+1);
            }

            public void setIntelligence() {
                int min = 8;
                int max = 12;
                this.intelligence = min + rand.nextInt(max-min+1);
            }

            public void setDexterity() {
                int min = 15;
                int max = 20;
                this.dexterity =  min + rand.nextInt(max-min+1);
            }

            public void setAgility() {
                int min = 18;
                int max = 25;
                this.agility =  min + rand.nextInt(max-min+1);
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
        }
    static class Warrior { Random rand = new Random();
        private int health;
        private int strength;
        private int intelligence;
        private int dexterity;
        private int agility;
        private double damage;


        public Warrior(InputStream in) {
            setHealth();
            setStrength();
            setIntelligence();
            setDexterity();
            setAgility();
            setDamage();
        }

        public void setHealth() {
            int max = 180;
            int min = 120;
            this.health =  min + rand.nextInt(max-min+1);
        }
        public void setStrength() {
            int min = 18;
            int max = 25;
            this.strength =  min + rand.nextInt(max-min+1);
        }
        public void setIntelligence() {
            int min = 8;
            int max = 10;
            this.intelligence =  min + rand.nextInt(max-min+1);
        }
        public void setDexterity() {
            int min = 10;
            int max = 15;
            this.dexterity = min + rand.nextInt(max-min+1);

        }
        public void setAgility() {
            int min = 18;
            int max = 25;
            this.agility =  min + rand.nextInt(max-min+1);
        }
        public void setDamage() {
            this.damage = (strength * 1.5) + (dexterity * 1.2) + (agility * 1.1) + (intelligence * 0.8);
        }

        public int getHealth() {
            return health;
        }
        public int getStrength(){
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
    }
    static class Mage {
        Random rand = new Random();
        private int health;
        private int strength;
        private int intelligence;
        private int dexterity;
        private int agility;
        private double damage;

        public Mage(InputStream in)  {
            setHealth();
            setStrength();
            setIntelligence();
            setDexterity();
            setAgility();
            setDamage();

        }

        public void setHealth() {
            int max = 100;
            int min = 60;
            this.health =  min + rand.nextInt(max-min+1);
        }

        public void setStrength() {
            int min = 6;
            int max = 10;
            this.strength =  min + rand.nextInt(max-min+1);
        }

        public void setIntelligence() {
            int min = 18;
            int max = 25;
            this.intelligence =  min + rand.nextInt(max-min+1);

        }

        public void setDexterity() {
            int min = 18;
            int max = 25;
            this.dexterity =  min + rand.nextInt(max-min+1);
        }
        public void setAgility(){
            int min = 7;
            int max = 14;
            this.agility = min + rand.nextInt(max-min+1);
        }

        public void setDamage() {
            this.damage = (strength * 1.5) + (dexterity * 1.2) + (agility * 1.1) + (intelligence * 0.8);

        }
        public int getHealth() {
            return health;
        }
        public int getStrength(){
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
    }
    static class Warlock{ Random rand = new Random();
        private int health;
        private int strength;
        private int intelligence;
        private int dexterity;
        private int agility;
        private double damage;

        public Warlock(InputStream in) {
            setHealth();
            setStrength();
            setIntelligence();
            setDexterity();
            setAgility();
            setDamage();
        }

        public void setHealth() {
            int max = 100;
            int min = 70;
            this.health = min + rand.nextInt(max-min+1);
        }

        public void setStrength() {
            int max = 12;
            int min = 6;
            this.strength =  min + rand.nextInt(max-min+1);
        }

        public void setIntelligence() {
           int max = 25;
           int min = 18;
           this.intelligence= min + rand.nextInt(max-min+1);
        }

        public void setDexterity() {
           int max  =  15;
           int min  =  10;
           this.dexterity =  min + rand.nextInt(max-min+1);
        }

        public void setAgility() {
            int max = 14;
            int min =  8;
            this.agility =  min + rand.nextInt(max-min+1);
        }

        public void setDamage() {
            this.damage =  (strength * 1.2) + (dexterity * 1.0) + (agility * 1.1) + (intelligence * 1.8);
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


    }
    static class Priest{ Random rand = new Random();
        private int health;
        private int strength;
        private int intelligence;
        private int dexterity;
        private int agility;
        private double damage;

        public Priest(InputStream in)  {
            setHealth();
            setStrength();
            setIntelligence();
            setDexterity();
            setAgility();
            setDamage();
        }

        public void setHealth() {
            int max = 60;
            int min = 90;
            this.health =  min + rand.nextInt(max-min+1);
        }
        public void setStrength() {
            int min = 5;
            int max = 10;
            this.strength =  min + rand.nextInt(max-min+1);
        }
        public void setIntelligence() {
            int min = 16;
            int max = 24;
            this.intelligence =  min + rand.nextInt(max-min+1);
        }
        public void setDexterity() {
            int min = 8;
            int max = 12;
            this.dexterity = min + rand.nextInt(max-min+1);

        }
        public void setAgility() {
            int min = 10;
            int max = 15;
            this.agility =  min + rand.nextInt(max-min+1);
        }
        public void setDamage() {
            this.damage = (strength * 0.5) + (dexterity * 1.8) + (agility * 1.1) + (intelligence * 0.8);
        }

        public int getHealth() {
            return health;
        }
        public int getStrength(){
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

    }
    static class Paladin{ Random rand = new Random();
        private int health;
        private int strength;
        private int intelligence;
        private int dexterity;
        private int agility;
        private double damage;


        public Paladin(InputStream in) {
            setHealth();
            setStrength();
            setIntelligence();
            setDexterity();
            setAgility();
            setDamage();
        }

        public void setHealth() {
            int max = 150;
            int min = 100;
            this.health = min + rand.nextInt(max-min+1);
        }

        public void setStrength() {
            int max = 12;
            int min = 20;
            this.strength =  min + rand.nextInt(max-min+1);
        }

        public void setIntelligence() {
            int max = 8;
            int min = 16;
            this.intelligence= min + rand.nextInt(max-min+1);
        }

        public void setDexterity() {
            int max  =  10;
            int min  =  18;
            this.dexterity =  min + rand.nextInt(max-min+1);
        }

        public void setAgility() {
            int max = 10;
            int min =  18;
            this.agility =  min + rand.nextInt(max-min+1);
        }

        public void setDamage() {
            this.damage =  (strength * 1.5) + (dexterity * 1.5) + (agility * 1.1) + (intelligence * 1.8);
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


    }




}
