import java.util.*;
interface Purchasable {
    String getName();
    int getId();
    double getPrice();
}

class Wheat {
    private String name="Wheat";
    private double pricePerUnit=800;
    // public Wheat(String name, double pricePerKg) {
    //     this.name = name;
    //     this.pricePerKg = pricePerKg;
    // }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return pricePerUnit;
    }
}
class Rice {
    private String name="Rice";
    private double pricePerUnit=960;
    // public Wheat(String name, double pricePerKg) {
    //     this.name = name;
    //     this.pricePerKg = pricePerKg;
    // }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return pricePerUnit;
    }
}
class Bean {
    private String name="Bean";
    private double pricePerUnit=1080;
    // public Wheat(String name, double pricePerKg) {
    //     this.name = name;
    //     this.pricePerKg = pricePerKg;
    // }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return pricePerUnit;
    }
}
class Maize {
    private String name="Maize";
    private double pricePerUnit=1440;
    // public Wheat(String name, double pricePerKg) {
    //     this.name = name;
    //     this.pricePerKg = pricePerKg;
    // }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return pricePerUnit;
    }
}
class Soyabeen {
    private String name="Soyabeen";
    private double pricePerUnit=2140;
    // public Wheat(String name, double pricePerKg) {
    //     this.name = name;
    //     this.pricePerKg = pricePerKg;
    // }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return pricePerUnit;
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

        String [] cropsList = {"1.Wheat","2.Rice","3.Bean","4.Maize","5.Soyabeen"};
        String [] cropsPrice = {"800","960","1080","1440","2140"};

        while (true) {
            System.out.println("Crop Buying System: ");
            System.out.println("1. Choose Crop the farmer want to sell:");
            System.out.println("2. View Crops");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    purchaseCrop(sc);
                    break;
                case 2:
                    System.out.println(Arrays.toString(cropsList));
                    System.out.println(Arrays.toString(cropsPrice) + " (cost per unit in Rupees)");
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.🙏");
            }
            
            
        // String cropToSell = sc.next();
        

        
        // }
    }
    private static void purchaseCrop(Scanner scanner) {
                System.out.print("Enter crop no.: ");
                int cropNo = scanner.nextInt();
        
                System.out.print("Enter crop quantity (in units): ");
                double cropQuantity = scanner.nextDouble();

                switch (cropNo) {
                case 1:
                    Wheat w = new Wheat();
                    break;
                    // save to file 
                    // agent name,agent id ,farmer name ,farmer Aadhar, <cropname> (w.getName),<crop quantity>(cropQuantity),
                    //  total amount (cropQuantity*w.getPrice), 
                case 2:
                    Rice r= new Rice();
                    break;

                case 3:
                    Bean b= new Bean();
                    break;
                    
                case 4:
                    Maize m= new Maize();
                    break;
                    
                case 5:
                    Soyabeen s= new Soyabeen();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.🙏");
            }
                
                
                System.out.println("Crop successfully.");
            }
}




