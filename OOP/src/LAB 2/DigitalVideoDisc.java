public class DigitalVideoDisc {
    private String Title;
    private String Category;
    private String Directory;
    private int Length;
    private float Cost;

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
    }

    public DigitalVideoDisc( String Category, String Title, float Cost){
        super();
        this.Title = Title;
        this.Category = Category;
        this.Cost = Cost;
    }

    public DigitalVideoDisc(String Directory, String Category, String Title, float Cost){
        super();
        this.Directory = Directory;
        this.Title = Title;
        this.Category = Category;
        this.Cost = Cost;
    }

    public DigitalVideoDisc(String Title, String Category, String Directory, int Length, float Cost){
        super();
        this.Directory = Directory;
        this.Title = Title;
        this.Category = Category;
        this.Cost = Cost;
        this.Length = Length;
    }
}
