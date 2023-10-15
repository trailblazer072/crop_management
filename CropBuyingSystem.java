import java.util.*;
interface Purchasable {
    String getName();
    int getId();
    double getPrice();
}

class Crop {
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

// Class representing a Agent
class Agent {
    private String agentName;
    private int agentId;

    public Agent(String agentName,int agentId) {
        this.agentName= agentName;
        this.agentId= agentId;
    }

    void display(){
        System.out.println(agentName+" "+ agentId);
    }

    public String getName() {
        return agentName;
    }
    public int getId() {
        return agentId;
    }
}

class Farmer extends Agent {
    private String farmerName;
    private double farmerAadharNo;
    public Farmer(String agentName,int agentId,String farmerName,double farmerAadharNo) {
        super(agentName,agentId);
        this.farmerName=farmerName;
        this.farmerAadharNo = farmerAadharNo;
    }
    void display(){
        System.out.println(farmerName+" "+ farmerAadharNo);
    }
}
    // public void paymentDetails() {
    //     double totalAmount = 0;
    //     System.out.println("Receipt for " + getName() + ":");
    //     System.out.println("Total: $" + totalAmount);
    // }


public class CropBuyingSystem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //taking input agent details
        System.out.print("Enter your Agent Name: ");
        String agentName = sc.nextLine();
        System.out.print("Enter your Agent Id: ");
        int agentId=sc.nextInt();
        //taking input farmer details
        System.out.print("Enter Farmer's Name: ");
        String farmerName = sc.next();
        System.out.print("Enter Farmer's Aadhar Number: ");
        double farmerAadharNo=sc.nextDouble();
        Farmer token =new Farmer(agentName, agentId, farmerName, farmerAadharNo);
        //taking input for crop to be sell
        String [] cropsList = {"Wheat","Rice","Bean","Maize","Soyabeen"};
        System.out.println("Choose which crop the farmer want to sell:");
        
        System.out.println(Arrays.toString(cropsList));
        String cropToSell = sc.next();
        Crop crop=new Crop();

        
    }
}


