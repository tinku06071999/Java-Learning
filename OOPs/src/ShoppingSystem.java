import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingSystem {
    private Customer customer;
    private Cart cart;
    private Product product;

    public ShoppingSystem(Customer customer, Cart cart, Product product){
        this.customer = customer;
        this.cart = cart;
        this.product = product;
    }
}
class Customer{
    private String name;
    private String address;

    public Customer(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void login(){
        System.out.println("Loggged in Succesfully !!!");
    }
    public void logOut(){
        System.out.println("Logged out Suuccesfully !!!");
    }
    public void selectProduct(String product){
        System.out.println("Product slected !!!");
    }
}
class Cart{
    private ArrayList<String> items = new ArrayList<>();

    public Cart(String ...items) {
        for(String item : items){
            this.items.add(item.toUpperCase());
        }
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItem(ArrayList<String> items) {
        this.items = items;
    }
    public void add(String item){
        items.add(item.toUpperCase());
    }
    public void remove(String item){
        boolean found = false;
        for(String itm : items){
            if(itm.equals(item.toUpperCase())){
                items.remove(itm);
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Item removed successfully!!!");
        }else{
            System.out.println("!!!Error!!! Item Not Found");
        }

    }
}
class Product{
    private String name;
    private double price;
    private int quantityAvailable;

    public Product(String name, double price, int quantityAvailable) {
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void order(){
        System.out.println("Congratulations !!! Ordered Successfully !!!");
    }
    public void changePrice(){
        price = price - price * 0.3;
        System.out.println("Price after applying the deduction" + price);
    }
}