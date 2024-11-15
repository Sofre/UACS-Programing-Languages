public class Bird implements  Animal{
    @Override
    public void sound() {
        System.out.println("Bird sings");
    }

    @Override
    public void move() {
        System.out.println("Bird fly's");

    }

    @Override
    public void sleep() {
        System.out.println("Bird Sleeps");

    }
}
