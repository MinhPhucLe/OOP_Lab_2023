package hust.soict.globalict.aims.media;

public class Disc extends Media {
    private int length;
    private String directory;

    public int getLength() {
        return length;
    }

    public String getDirectory() {
        return directory;
    }

    public Disc() {}

    public Disc(int id , String title , String category , String director , int length, float cost ){
        super(id , title , category , cost);
        this.directory = director;
        this.length = length;
    }
}
