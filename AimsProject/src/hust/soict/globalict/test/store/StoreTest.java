package hust.soict.globalict.test.store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args){
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        // Test add method
        store.addItems(dvd1);
        store.print();
        // Test remove method
        store.removeItems(dvd1);
        store.print();
    }
}
