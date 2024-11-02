class SpeedHero extends Superhero {
    SpeedHero(String heroName) {
        super(heroName);
    }

    @Override
    public String getHeroName() {
        return super.getHeroName();
    }

    @Override
    public void fight() {
        System.out.println("The hero runs with haste... no bad guy can stop him !!!");
    }
}
