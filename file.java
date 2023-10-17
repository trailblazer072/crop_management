import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CropBuyingSystem {
    private static List<Crop> cropData = new ArrayList<>();
    private static final String FILE_PATH = "crop_data.txt";

    public static void main(String[] args) {
        loadCropData(); // Load existing data from the file

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Crop Buying System");
            System.out.println("1. Add Crop");
            System.out.println("2. View Crops");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addCrop(scanner);
                    break;
                case 2:
                    viewCrops();
                    break;
                case 3:
                    saveCropData(); // Save data to the file before exiting
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addCrop(Scanner scanner) {
        System.out.print("Enter crop name: ");
        String cropName = scanner.nextLine();

        System.out.print("Enter crop quantity (in kg): ");
        double cropQuantity = scanner.nextDouble();

        System.out.print("Enter crop price per kg: ");
        double cropPrice = scanner.nextDouble();

        Crop crop = new Crop(cropName, cropQuantity, cropPrice);
        cropData.add(crop);
        System.out.println("Crop added successfully.");
    }

    private static void viewCrops() {
        if (cropData.isEmpty()) {
            System.out.println("No crops added yet.");
        } else {
            System.out.println("Crop Name\tQuantity (kg)\tPrice per kg");
            for (Crop crop : cropData) {
                System.out.println(crop);
            }
        }
    }

    private static void loadCropData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String cropName = parts[0];
                    double cropQuantity = Double.parseDouble(parts[1]);
                    double cropPrice = Double.parseDouble(parts[2]);
                    Crop crop = new Crop(cropName, cropQuantity, cropPrice);
                    cropData.add(crop);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while loading data: " + e.getMessage());
        }
    }

    private static void saveCropData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Crop crop : cropData) {
                writer.write(crop.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving data: " + e.getMessage());
        }
    }
}

class Crop {
    private String name;
    private double quantity;
    private double price;

    public Crop(String name, double quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "\t" + quantity + " kg\t$" + price;
    }

    public String toCSV() {
        return name + "," + quantity + "," + price;
    }
}