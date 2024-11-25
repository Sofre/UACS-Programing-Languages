public class Elf implements MagicalCreature,Guardian,Healer {

    public String name;
    public String treasure;
    public int healingpower;

    public Elf(String name, String treasure, int healingpower) {
        this.name = name;
        this.treasure = treasure;
        this.healingpower = healingpower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    public int getHealingpower() {
        return healingpower;
    }

    public void setHealingpower(int healingpower) {
        this.healingpower = healingpower;
    }

    @Override
    public void guardTreasure() {
        System.out.println("Guarding the mystic treasure of the Alheim.. " + treasure);
    }

    @Override
    public int healPlayer(int healthpoints) {
        return healthpoints;
    }


    @Override
    public void interact() {
        System.out.println("You have interacted with the elf  "+ name);
    }
}
