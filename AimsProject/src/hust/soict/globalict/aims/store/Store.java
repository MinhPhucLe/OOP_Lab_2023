package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[1000100];
    public static int numOfItems = 0;

    public void addItems(DigitalVideoDisc dvd) {
        itemsInStore[numOfItems] = dvd;
        numOfItems++;
    }

    public void removeItems(DigitalVideoDisc dvd) {
        int pos = 0;
        for (int i = 0; i < numOfItems; ++ i){
            if (itemsInStore[i] == dvd){
                numOfItems--;
                pos = i;
                break;
            }
        }
        for (int i = pos; i < numOfItems; ++ i){
            itemsInStore[i] = itemsInStore[i + 1];
        }
        System.out.println("The DICS is deleted");
    }

    public void print() {
        if (numOfItems < 0){
            System.out.println("There isn't any items in the store");
        }
        for (int i = 0; i < numOfItems; ++ i)
            System.out.println(itemsInStore[i].getTitle());
    }
}
