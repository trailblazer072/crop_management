import java.util.ArrayList;
import java.util.List;

// Interface for any item that can be bought
interface Purchasable {
    String getName();
    double getPrice();
}

// Class representing a Crop
class Crop implements Purchasable {
    private String name;
    private double pricePerKg;

    public Crop(String name, double pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return pricePerKg;
    }
}

// Class representing a Person
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Farmer extends Person {
    public Farmer(String name) {
        super(name);
    }
}

// Class representing a Consumer
class Consumer extends Person {
    private List<Purchasable> shoppingCart;

    public Consumer(String name) {
        super(name);
        shoppingCart = new ArrayList<>();
    }

    public void addToCart(Purchasable item) {
        shoppingCart.add(item);
    }

    public void checkout() {
        double totalAmount = 0;
        System.out.println("Receipt for " + getName() + ":");
        for (Purchasable item : shoppingCart) {
            totalAmount += item.getPrice();
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + totalAmount);
    }
}

public class CropBuyingSystem {
    public static void main(String[] args) {
        Purchasable wheat = new Crop("Wheat", 2.5);
        Purchasable corn = new Crop("Corn", 3.0);

        Farmer farmer1 = new Farmer("John");
        Farmer farmer2 = new Farmer("Alice");

        Consumer consumer = new Consumer("Bob");

        consumer.addToCart(wheat);
        consumer.addToCart(corn);

        consumer.checkout();
    }
}
