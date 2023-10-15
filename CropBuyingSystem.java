import java.util.*;
interface Purchasable {
    String getName();
    double getPrice();
}

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

// Class representing a Person1
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

class Consumer extends Person {

    public Consumer(String name) {
        this.name=name;
    
    }

   

    public void paymentDetails() {
        double totalAmount = 0;
        System.out.println("Receipt for " + getName() + ":");
        System.out.println("Total: $" + totalAmount);
    }
}

public class CropBuyingSystem {
    public static void main(String[] args) {
        Purchasable wheat = new Crop();
        Purchasable corn = new Crop();

        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();

        Consumer consumer = new Consumer();
        
    }
}
