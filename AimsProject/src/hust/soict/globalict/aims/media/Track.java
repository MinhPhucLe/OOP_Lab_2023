package hust.soict.globalict.aims.media;

public class Track implements Playable {
    private String title;
    private int length;
    public Track() {}
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public boolean equals(Object item) {
        if (item == this) return true;
        if (!(item instanceof Track)) {
            return false;
        }

        Track track = (Track) item;
        return (this.getTitle().equals(track.title) && (this.getLength() == track.length));
    }
}
