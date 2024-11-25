public class Main {
    public static void main(String[] args) {
        Dragon drake = new Dragon("Baldur","Lost Arch-wing's Treasure",600);
        Elf elf = new Elf("Legolas","Alfhild's Treasure , from the lost worlds",400);
        Goblin goblin = new Goblin("Kacinga","Kacinga's den of treasury ",300);

        System.out.println("Player interacts with creature");
        drake.interact();
        System.out.println();
        System.out.println("Players see's what creature is guarding ");
        drake.guardTreasure();
        System.out.println();
        System.out.println("Players gets attacked from creature..");
        System.out.println("Damage inflicted to player:   " + drake.castCurse(600));

        System.out.println();

        System.out.println("Player interacts with creature");
        elf.interact();
        System.out.println();
        System.out.println("Players see's what creature is guarding ");
        elf.guardTreasure();
        System.out.println();
        System.out.println("Players gets attacked from creature..");
        System.out.println("Healing player with  :   " + elf.healPlayer(1200));


        System.out.println();

        System.out.println("Player interacts with creature");
        goblin.interact();
        System.out.println();
        System.out.println("Players see's what creature is guarding ");
        goblin.guardTreasure();
        System.out.println();
        System.out.println("Players gets attacked from creature..");
        System.out.println("Damage inflicted to player:   " + goblin.castCurse(300));

    }
}