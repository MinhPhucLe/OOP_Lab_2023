package hust.soict.globalict;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();
        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDics (dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDics (dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDics (dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Kungfu Panda",
                "Animation","Man", 90, 19.95f );
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Man in Black",
                "Comedy", "Will Smith", 92, 30.25f);
        DigitalVideoDisc[] lst = {dvd4, dvd5};
        anOrder.addDigitalVideoDics(lst);
        anOrder.search("Kungfu Panda");
        //print total cost of the items in the cart
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.TotalCost());
        System.out.println(anOrder.qtyOrdered());
        anOrder.Orders();
        anOrder.RemoveDigitalVideoDics(dvd1);
        System.out.println(anOrder.qtyOrdered());
        anOrder.Orders();
    }
}
