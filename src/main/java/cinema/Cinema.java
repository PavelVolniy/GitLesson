package cinema;

public class Cinema {
    private String name;
    private String genre;
    private int duration;

    public Cinema(String name, String genre, int duration) {
        setName(name);
        setGenre(genre);
        setDuration(duration);
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) this.name = name;
        else this.name = "default";
    }

    public void setGenre(String genre) {
        if (genre != null && !genre.isEmpty()) this.genre = genre;
        else this.genre = "default";
    }

    public void setDuration(int duration) {
        if (duration > 0) this.duration = duration;
        else this.duration = 0;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                '}';
    }
}
