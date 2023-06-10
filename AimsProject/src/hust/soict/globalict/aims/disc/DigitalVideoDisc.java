package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
    private String Title;
    private String Category;
    private String Directory;
    private int Length;
    private float Cost;

    private static  int nbDigitalVideoDiscs = 0;

    public int id;

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDirectory(String directory) {
        Directory = directory;
    }

    public void setLength(int length) {
        Length = length;
    }

    public void setCost(float cost) {
        Cost = cost;
    }
    public String getTitle(){
        return Title;
    }
    public String getCategory(){
        return Category;
    }
    public String getDirectory(){
        return Directory;
    }
    public int getLength(){
        return Length;
    }
    public float getCost() {
        return Cost;
    }

    public DigitalVideoDisc(String Title){
        super();
        this.Title = Title;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc( String Title, String Category, float Cost){
        super();
        this.Title = Title;
        this.Category = Category;
        this.Cost = Cost;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String Title, String Category, String Directory, float Cost){
        super();
        this.Directory = Directory;
        this.Title = Title;
        this.Category = Category;
        this.Cost = Cost;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String Title, String Category, String Directory, int Length, float Cost){
        super();
        this.Directory = Directory;
        this.Title = Title;
        this.Category = Category;
        this.Cost = Cost;
        this.Length = Length;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public boolean isMatch(String title) {
        if (title == Title) return true;
        return  false;
    }
}
