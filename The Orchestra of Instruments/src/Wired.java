class Wired extends Instrument {

    @Override
    public void play() {
    System.out.println("Playing Wired");
    }

    @Override
    public String whatIsPlaying() {
       return "Wired";
    }
}
