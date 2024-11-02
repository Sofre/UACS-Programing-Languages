class Brass extends Instrument {

    @Override
    public void play() {
        System.out.println("Playing Brass");
    }

    @Override
    public String whatIsPlaying() {
        return "Brass";
    }
}
