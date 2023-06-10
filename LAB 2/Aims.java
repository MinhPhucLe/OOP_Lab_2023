public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();
        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDics (dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDics (dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDics (dvd3);
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
