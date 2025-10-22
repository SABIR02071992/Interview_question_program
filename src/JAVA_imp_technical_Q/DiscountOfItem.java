package JAVA_imp_technical_Q;

import java.util.ArrayList;
import java.util.List;

public class DiscountOfItem {
    public static void main(String[] args) {

        List<LineItem> cart = new ArrayList<>();
        cart.add(new LineItem(new Item("Pizza",120),4));
        cart.add(new LineItem(new Item("Noodles",155),2));
        cart.add(new LineItem(new Item("Burger",120),4));

        double grantTotal = 0.0;

        for (LineItem lineItem: cart){

            var total = lineItem.qty* lineItem.item.price;
            System.out.println("Total: "+total);

            if (lineItem.qty>=2){

                total = total-(total*0.10);
            }
            grantTotal+=total;

            if(grantTotal>=2500){

                grantTotal = grantTotal-(grantTotal*0.05);
            }
            System.out.println(grantTotal);


        }

    }
}

class Item{
    String name;
    double price;

    public Item(String name,double price){
        this.name = name;
        this.price = price;
    }

}

class LineItem{
    public Item item;
    public int qty;

    public LineItem(Item item, int qty){
        this.item = item;
        this.qty = qty;
    }
}