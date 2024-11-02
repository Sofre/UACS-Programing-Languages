//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new King("Charles",80);
        person[1] = new Queen("Victoria",88);
        person[2] = new Prince("Henry",45);

        for(Person p : person){
            System.out.println();
            p.print();
        }
    }
}