package kolll.lesson10.entity;

public class Album {

    private String name;
    private String track;
    private String musicans;

    public Album() {
    }

    public Album(String name, String track, String musicans) {
        this.name = name;
        this.track = track;
        this.musicans = musicans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getMusicans() {
        return musicans;
    }

    public void setMusicans(String musicans) {
        this.musicans = musicans;
    }
}
