package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Comparator.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Cart {
    public static final int MAX_ORDERS = 20;
    public int Num_Orders = 0;
    private final List<Media> itemsOrdered = new ArrayList<>();
    public Cart() {};
    public void addMedia (Media media){
        for (int i = 0; i < itemsOrdered.size(); ++ i) {
            if (itemsOrdered.get(i).equals(media)) {
                System.out.println("Media already existed !");
                return;
            }
        }
        itemsOrdered.add(media);
        System.out.println("Add Successfully");
        return;
    }

    public int size() {
        return itemsOrdered.size();
    }

    public float TotalCost(){
        float sum = 0;
        for (int i = 0; i < itemsOrdered.size(); ++ i){
            sum += itemsOrdered.get(i).getCost();
        }
        return sum;
    }

    public void removeMedia(Media media){
        for(Media item : itemsOrdered){
            if(item.equals(media)){
                itemsOrdered.remove(media);
                System.out.println("Remove Successfully");
                return;
            }
        }
        System.out.println("Can't find that media !");
    }

    public void removeMedia(String title){
        for(int i = 0; i < itemsOrdered.size(); ++ i){
            Media item = itemsOrdered.get(i);
            if(item.getTitle().equals(title)){
                itemsOrdered.remove(item);
                System.out.println("Remove Successfully");
                return;
            }
        }
        System.out.println("Can't find that media !");
    }

    public void ClearCart() {
        itemsOrdered.clear();
    }

    public void Print() {
        System.out.println("**********************CART**********************");
        System.out.println("Ordered Items");
        for (int i = 0; i < itemsOrdered.size(); ++ i){
            System.out.print(i);
            System.out.println(itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + TotalCost() + "$");
        System.out.println("************************************************");
    }

    public void sortByTitle(){
        Collections.sort(itemsOrdered , Media.COMPARE_BY_TITLE_COST);
    }
    public void sortByCost(){
        Collections.sort(itemsOrdered , Media.COMPARE_BY_COST_TITLE);
    }

    public Media search(String name){
        for (int i = 0; i < itemsOrdered.size(); ++ i){
            if (itemsOrdered.get(i).getTitle().equals(name)){
                System.out.println("This item exists");
                return itemsOrdered.get(i);
            }
        }
        ///System.out.println("Invalid items");
        return null;
    }

    public Media search(int id) {
        for (int i = 0; i < itemsOrdered.size(); ++ i){
            if (itemsOrdered.get(i).getId() == id){
                System.out.println("This item exists");
                return itemsOrdered.get(i);
            }
        }
        ///System.out.println("Invalid items");
        return null;
    }
}
