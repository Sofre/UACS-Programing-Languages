class StrenghtHero extends Superhero {

    StrenghtHero(String heroName) {
        super(heroName);
    }

    @Override
    public String getHeroName() {
        return super.getHeroName();
    }

    @Override
    public void fight() {
        System.out.println("The strenght of this hero frightens the bad guys!!!  ");
    }
}
