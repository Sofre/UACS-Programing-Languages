import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Instrument[] instruments = new Instrument[5];
            instruments[0] = new Brass();
            instruments[1] = new Precussion();
            instruments[2] = new Trumpent();
            instruments[3] = new Guitar();
            instruments[4] = new Wired();

            for(Instrument i : instruments){

                i.play();
                System.out.println(i.whatIsPlaying());
            }

    }
}