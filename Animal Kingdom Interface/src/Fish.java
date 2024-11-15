public class Fish implements Animal{
    @Override
    public void sound() {
        System.out.println("Fish makes no sound");
    }

    @Override
    public void move() {
        System.out.println("Fish swims");

    }

    @Override
    public void sleep() {
        System.out.println("Fish doesn't sleep");

    }

}
