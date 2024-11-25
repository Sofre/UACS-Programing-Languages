public class Goblin implements MagicalCreature,Guardian,Curser{
    public String name;
    public String treasure;
    public int curseDamage;

    public Goblin(String name, String treasure, int curseDamage) {
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
        System.out.println("Guarding the stolen treasures of the worlds combine.. " + treasure);


    }

    @Override
    public void interact() {
        System.out.println("You have interacted with the goblin  " + name);
    }









}
