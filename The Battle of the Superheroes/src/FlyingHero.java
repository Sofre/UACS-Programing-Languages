class FlyingHero extends Superhero {

    public FlyingHero(String heroName) {
        super(heroName);
    }

    @Override
    public String getHeroName() {
        return super.getHeroName();
    }

    @Override
    public void fight() {
        System.out.println("No bad guys can reach where this hero is...!!!");
    }
}
