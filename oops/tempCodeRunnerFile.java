class Product{
    String item;
    double price;
    int quantity;

    public void iteminfo(){
        System.out.println(item);
        System.out.println(price);
        System.out.println(quantity);
    }
    public void calbill(){
        double total = price * quantity;
        System.out.println("Your total bill is : - " + total);
    }
}
public class oops{
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.item = "Sugar";
        p1.price = 89.00;
        p1.quantity = 2;
        p1.iteminfo();
        p1.calbill();
    }
}