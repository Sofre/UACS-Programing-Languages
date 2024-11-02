abstract class Superhero {
    protected String heroName;
    public Superhero(String heroName) {
        this.heroName = heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    public String getHeroName() {
        return heroName;
    }

    public abstract void fight();
}
