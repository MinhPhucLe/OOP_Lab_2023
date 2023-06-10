package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Media {
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;

    private static  int nbDigitalVideoDiscs = 0;

    public int id;


    public void setDirectory(String directory) {
        directory = directory;
    }

    public void setLength(int length) {
        length = length;
    }

    public String getDirectory(){
        return directory;
    }
    public int getLength(){
        return length;
    }

    public DigitalVideoDisc(String title){
        super(title);
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc( String title, String category, float cost){
        super(title, category, cost);
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String directory, float cost){
        super(title, category, cost);
        this.directory = directory;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String directory, int length, float cost){
        super(title, category, cost);
        this.directory = directory;
        this.length = length;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public boolean isMatch(String title) {
        if (title == title) return true;
        return  false;
    }
}
