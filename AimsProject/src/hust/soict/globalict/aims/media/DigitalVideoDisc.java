package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;

    private static  int nbDigitalVideoDiscs = 0;

    public int id;


    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirectory(){
        return directory;
    }
    public int getLength(){
        return length;
    }

    public DigitalVideoDisc(String title){
        setTitle(title);
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc( String title, String category, float cost){
        setTitle(title);
        setCategory(category);
        setCost(cost);
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String directory, float cost){
        setTitle(title);
        setCategory(category);
        setCost(cost);
        this.directory = directory;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String directory, int length, float cost){
        setTitle(title);
        setCategory(category);
        setCost(cost);
        this.directory = directory;
        this.length = length;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(int id, String title, String category, String directory, int length, float cost) {
        super(id, title, category, directory, length, cost);
    }
    public boolean isMatch(String title) {
        if (title == title) return true;
        return  false;
    }
    public StringBuffer play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
            StringBuffer info = new StringBuffer("");
            info.append("Playing DVD: " + this.getTitle() + "\n" + "DVD length: " + this.getLength());
            return info;
        } else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
    }

    public String toString(){
        StringBuffer printDisc = new StringBuffer();
        printDisc.append(getId());
        printDisc.append(" - ");
        printDisc.append("DVD");
        printDisc.append(" - ");
        printDisc.append(getTitle());
        printDisc.append(" - ");
        printDisc.append(getCategory());
        printDisc.append(" - ");
        printDisc.append(getDirectory());
        printDisc.append(" - ");
        printDisc.append(getLength());
        printDisc.append(": ");
        printDisc.append(getCost());
        return  printDisc.toString();
    }
}
