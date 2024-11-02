import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Roscoe");
        animals[1] = new Lion("Simba");
        animals[2] = new Frog("David");
        animals[3] = new SaraMountainDog("Max");



       for(Animal a : animals)
       {
           a.onamatopoea();
           if(a instanceof SaraMountainDog){
               ((SaraMountainDog)a).traits();
           }
       }



    }
}
// NOT FINISHED TO BE DONE!!!