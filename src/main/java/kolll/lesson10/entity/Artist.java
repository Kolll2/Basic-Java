package kolll.lesson10.entity;

public class Artist {

    private String name;

    private String mambers;

    private String origin;

    public Artist() {
    }

    public Artist(String name, String mambers, String origin) {
        this.name = name;
        this.mambers = mambers;
        this.origin = origin;
    }

    public boolean isFrom (String country){
        return origin.equals(country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMambers() {
        return mambers;
    }

    public void setMambers(String mambers) {
        this.mambers = mambers;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", mambers='" + mambers + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
