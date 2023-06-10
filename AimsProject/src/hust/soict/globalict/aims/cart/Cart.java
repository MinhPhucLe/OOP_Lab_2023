package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.*;

public class Cart {
    public static final int MAX_ORDERS = 20;
    public int Num_Orders = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_ORDERS];
    public void addDigitalVideoDics(DigitalVideoDisc DVD){
        if (Num_Orders < 20){
            itemsOrdered[Num_Orders] = DVD;
            Num_Orders++;
            System.out.println("The disc has been added");
        }
        else {
            System.out.println("The cart is almost full");
        }
    }
    /*public void addDigitalVideoDics(DigitalVideoDisc... dvdList){
        int num = dvdList.length;
        for (int i = 0; i < num; ++ i){
            itemsOrdered[Num_Orders] = dvdList[i];
            Num_Orders++;
            System.out.println("The disc" + dvdList[i].getTitle() + "has been added");
        }
    }*/

    public void addDigitalVideoDics(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        Num_Orders++;
        itemsOrdered[Num_Orders] = dvd1;
        System.out.println("The disc" + dvd1.getTitle() + "has been added");
        Num_Orders++;
        itemsOrdered[Num_Orders] = dvd2;
        System.out.println("The disc" + dvd2.getTitle() + "has been added");
    }

    public void addDigitalVideoDics(DigitalVideoDisc[] dvdList){
        int num = dvdList.length;
        for (int i = 0; i < num; ++ i){
            itemsOrdered[Num_Orders] = dvdList[i];
            Num_Orders++;
            System.out.println("The disc" + dvdList[i].getTitle() + "has been added");
        }
    }

    public float TotalCost(){
        float sum = 0;
        for (int i = 0; i < Num_Orders; ++ i){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public int qtyOrdered(){
        return Num_Orders;
    }

    public void Orders(){
        for (int i = 0; i < Num_Orders; ++ i) {
            System.out.println(itemsOrdered[i].getTitle());
            System.out.println(itemsOrdered[i].getDirectory());
            System.out.println(itemsOrdered[i].getCategory());
            System.out.println(itemsOrdered[i].getLength());
            System.out.println(itemsOrdered[i].getCost());
            System.out.println("---------------------------------------------------------------");
        }
    }

    public void RemoveDigitalVideoDics(DigitalVideoDisc DVD){
        int pos = 0;
        for (int i = 0; i < Num_Orders; ++ i){
            if (itemsOrdered[i] == DVD){
                Num_Orders--;
                pos = i;
                break;
            }
        }
        for (int i = pos; i < Num_Orders; ++ i){
            itemsOrdered[i] = itemsOrdered[i + 1];
        }
        System.out.println("The DICS is deleted");
    }

    public void Print() {
        System.out.println("**********************CART**********************");
        System.out.println("Ordered Items");
        for (int i = 0; i < Num_Orders; ++ i){
            System.out.print(i);
            System.out.println(".DVD -" + itemsOrdered[i].getTitle() + " " + itemsOrdered[i].getCategory() + " " + itemsOrdered[i].getDirectory() + " " + itemsOrdered[i].getLength() + " :" +
                    itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + TotalCost() + "$");
        System.out.println("************************************************");
    }

    public void search(String name){
        for (int i = 0; i < Num_Orders; ++ i){
            if (itemsOrdered[i].isMatch(name)){
                System.out.println("This item exists");
                return;
            }
        }
        System.out.println("Invalid items");
    }
}
