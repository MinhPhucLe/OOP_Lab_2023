package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;

    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc() {}
    public CompactDisc(int id , String title , String category , String director , int length, float cost,String artist) {
        super(id, title, category, director, length, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        for (int i = 0; i < tracks.size(); ++ i) {
            if (tracks.get(i).equals(track)){
                System.out.println("Track already existed !");
                return;
            }
        }
        tracks.add(track);
        System.out.println("Add Successfully");
    }

    public void removeTrack(Track track) {
        for (int i = 0; i < tracks.size(); ++ i) {
            if (tracks.get(i).equals(track)){
                tracks.remove(track);
                System.out.println("Remove Successfully");
                return;
            }
        }
        System.out.println("Remove Usuccessfully");
    }

    public int getlength() {
        int sumLength = 0;
        for (int i = 0; i < tracks.size(); ++ i) {
            sumLength += tracks.get(i).getLength();
        }
        return sumLength;
    }
    public void play() {
        for (int i = 0; i < tracks.size(); ++ i) {
            tracks.get(i).play();
        }
    }
}
