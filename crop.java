import java.util.ArrayList;
import java.util.List;

class Crop {
    private int cropID;
    private String cropName;
    private String cropType;
    private double quantity;
    private double pricePerUnit;

   
}

class Farmer {
    private int farmerID;
    private String farmerName;
    private String contactNumber;
    private String address;
    private List<Crop> cropsForSale;
}
class Consumer {
    private int consumerID;
    private String consumerName;
    private String contactNumber;
     private String address;
}
class PurchaseOrder {
    private int orderID;
    private Crop crop;
    private Consumer consumer;
    private double quantity;
    private double totalPrice;

   
}
class CropBuyingSystem {
    private List<Farmer> farmers = new ArrayList<>();
    private List<Consumer> consumers = new ArrayList<>();
    private List<PurchaseOrder> purchaseOrders = new ArrayList<>();

 public class MainClass {
    public static void main(String[] args) {
        
        CropBuyingSystem buyingSystem = new CropBuyingSystem();

        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();
        Consumer consumer1 = new Consumer();

       

        PurchaseOrder order1 = new PurchaseOrder();
        PurchaseOrder order2 = new PurchaseOrder();

