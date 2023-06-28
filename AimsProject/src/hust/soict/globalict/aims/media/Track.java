package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;
    public Track() {}
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }
    public StringBuffer play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing track: " + this.getTitle());
            System.out.println("Track length: " + this.getLength());

            StringBuffer info = new StringBuffer("");
            info.append("Playing track: " + this.getTitle() + "\n" + "Track length: " + this.getLength());
            return info;
        } else {
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
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
