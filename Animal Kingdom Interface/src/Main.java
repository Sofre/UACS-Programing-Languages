public class Main {
    public static void main(String[] args) {

        Lion lion  = new Lion();
        Fish fish  = new Fish();
        Bird bird = new Bird();

        System.out.println("Lion output");
        lion.sleep();
        lion.move();
        lion.sound();

        System.out.println("Fish output");
        fish.sleep();
        fish.move();
        fish.sound();

        System.out.println("Bird output");
        bird.sleep();
        bird.move();
        bird.sound();


    }
}