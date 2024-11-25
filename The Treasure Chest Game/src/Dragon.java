public class Dragon implements MagicalCreature,Guardian,Curser{

    public String name;
    public String treasure;
    public int curseDamage;

    public Dragon(String name, String treasure, int curseDamage) {
        this.name = name;
        this.treasure = treasure;
        this.curseDamage = curseDamage;
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

    public void setCurseDamage(int curseDamage) {
        this.curseDamage = curseDamage;
    }

    @Override
    public int castCurse(int damagePoints) {
        return damagePoints;
    }

    @Override
    public void guardTreasure() {
        System.out.println("Guarding the forsaken treasure of the lost world.." + treasure);


    }

    @Override
    public void interact() {
        System.out.println("You have interacted with the dragon:  "+ name);
    }
}
