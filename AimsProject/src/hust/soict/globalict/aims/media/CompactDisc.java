package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

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
    public StringBuffer play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD length: " + this.getLength());

            StringBuffer info = new StringBuffer("");
            info.append("Playing CD: " + this.getTitle() + "\n" + "CD length: " + this.getLength() + "\n");

            for (Track t : tracks) {
                try {
                    StringBuffer trackInfo = t.play();
                    info.append(trackInfo + "\n");
                } catch (PlayerException e) {
                    throw e;
                }
            }
            return info;
        } else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }

    }

    public String toString(){
        StringBuffer printDisc = new StringBuffer();
        printDisc.append(getId());
        printDisc.append(" - ");
        printDisc.append("CD");
        printDisc.append(" - ");
        printDisc.append(getTitle());
        printDisc.append(" - ");
        printDisc.append(getCategory());
        printDisc.append(" - ");
        printDisc.append(getDirectory());
        printDisc.append(" - ");
        printDisc.append(getLength());
        printDisc.append(" - ");
        printDisc.append(getArtist());
        printDisc.append(": ");
        printDisc.append(getCost());
        return  printDisc.toString();
    }
}
