package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        int check = 0;
        for (int i = 0; i < authors.size(); ++ i){
            if (authors.get(i).equals(authorName)){
                check = 1;
                break;
            }
        }

        if (check == 0){
            System.out.println("Add Successfully");
            authors.add(authorName);
        }
        else {
            System.out.println("Exist item");
            return;
        }
    }

    public void removeAuthor(String authorName) {
        for (int i = 0; i < authors.size(); ++ i){
            if (authors.get(i).equals(authorName)){
                authors.remove(i);
                System.out.println("Remove Successfully");
                return;
            }
        }
        System.out.println("Remove Unsuccessfully");
    }
}
