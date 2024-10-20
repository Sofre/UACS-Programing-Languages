
import java.util.Objects;

public class Main {






    public static void main(String[] args) {



        Hero hero;
        hero = new Hero(System.in);
        System.out.println("Please Enter your Hero's info   :             ");
        hero.Set_Info();
        ProfanityChecker checker = new ProfanityChecker();
        if(ProfanityChecker.containsProfanity(hero.getHero_Name()))
        {
            System.out.println("The name contains profanity");
        }
        else
        {
            System.out.println("The name does not contain profanity");
        }


        System.out.print("Hero Lore :          ");
        System.out.println(hero.getHero_Name());
        System.out.print(hero.getTitle());

        System.out.println("Stats   :            ");
        hero.Display_Info();



    }


}