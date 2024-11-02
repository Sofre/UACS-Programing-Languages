//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle v  = new Vehicle("Leon",4,65.0,12.5);
        Vehicle v2 = new Vehicle("Golf",4,50.0,11.0);

        System.out.println(v.getModel()+ "can go" + v.distance() );
        System.out.println(v2.getModel()+ "can go" + v2.distance() );
        v.compare(v2);
        v2.compare(v);
    }
}