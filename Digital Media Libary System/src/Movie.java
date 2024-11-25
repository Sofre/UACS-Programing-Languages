public class Movie implements Media_Item,Playble,Downloadble {

    public String title;
    public String creator;
    public double Filesize;
    public int duration;


    public Movie(String title, String creator, double filesize, int duration) {
        this.title = title;
        this.creator = creator;
        Filesize = filesize;
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setFilesize(double filesize) {
        Filesize = filesize;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void download() {
        System.out.println("File at size "+Filesize+".. downloading..");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public void play() {
        System.out.println("Playing Movie : "+ title + "by  "+ creator);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Duration:  "+ duration);
    }

    @Override
    public void pause() {
        System.out.println("PAUSED");
    }

    @Override
    public void stop() {
        System.out.println("Exiting..");
    }
}
