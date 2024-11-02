class Guitar extends Wired{

    @Override
    public void play() {
        System.out.println("Playing Guitar");

    }
     void tweak(){

    }

    @Override
    public String whatIsPlaying() {
        return "Guitar";
    }
}
