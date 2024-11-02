//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Superhero[] heroes = new Superhero[3];
        heroes[0] = new FlyingHero("Superman");
        heroes[1] = new StrenghtHero("Wonder woman");
        heroes[2] = new SpeedHero("Flash");

        for(Superhero s : heroes){
            System.out.println();
            System.out.println("Hero Name: " + s.getHeroName());
            s.fight();
        }

    }
}