package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Media> itemsInStore = new ArrayList<>();
    public static int numOfItems = 0;

    public void addMedia (Media media){
        for (int i = 0; i < itemsInStore.size(); ++ i) {
            if (itemsInStore.get(i).equals(media)) {
                System.out.println("Media already existed !");
                return;
            }
        }
        itemsInStore.add(media);
        System.out.println("Add Successfully");
        return;
    }

    public void removeMedia(Media media){
        for(Media item : itemsInStore){
            if(item.equals(media)){
                itemsInStore.remove(media);
                System.out.println("Remove Successfully");
                return;
            }
        }
        System.out.println("Can't find that media !");
    }

    public void print() {
        for (int i = 0; i < itemsInStore.size(); ++ i)
            System.out.println(itemsInStore.get(i).toString());
    }
}
