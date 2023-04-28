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
}
