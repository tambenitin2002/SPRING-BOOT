package edu.jsp.center.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.jsp.center.services.BikeWashService;
import edu.jsp.center.services.CarWashService;
import edu.jsp.center.services.CycleWashService;
import edu.jsp.center.services.WeightLiftVehicleWashService;

import java.util.Scanner;

@Controller
public class ApplicationController {

    @Autowired
    private CarWashService carWashService;

    @Autowired
    private BikeWashService bikeWashService;

    @Autowired
    private CycleWashService cycleWashService;

    @Autowired
    private WeightLiftVehicleWashService weightLiftVehicleWashService;

    public void runApplication() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Washing Center Management System");
        do {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Manage Car Wash");
            System.out.println("2. Manage Bike Wash");
            System.out.println("3. Manage Cycle Wash");
            System.out.println("4. Manage Weight Lift Vehicle Wash");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageCarWash(scanner);
                    break;
                case 2:
                    manageBikeWash(scanner);
                    break;
                case 3:
                    manageCycleWash(scanner);
                    break;
                case 4:
                    manageWeightLiftWash(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Car Wash Management
    private void manageCarWash(Scanner scanner) {
        int carChoice;
        do {
            System.out.println("\n--- Manage Car Wash ---");
            System.out.println("1. Add Car Wash Record");
            System.out.println("2. List All Car Wash Records");
            System.out.println("3. Delete Car Wash Record by ID");
            System.out.println("4. Go Back");
            System.out.print("Enter your choice: ");

            carChoice = scanner.nextInt();

            switch (carChoice) {
                case 1:
                    System.out.print("Enter car wash details: ");
                    String carDetails = scanner.next(); // Simplified input
                    carWashService.addCarWash(carDetails);
                    System.out.println("Car wash record added successfully!");
                    break;
                case 2:
                    System.out.println("Listing all car wash records:");
                    carWashService.getAllCarWash().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int carId = scanner.nextInt();
                    carWashService.deleteCarWashById(carId);
                    System.out.println("Car wash record deleted successfully!");
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (carChoice != 4);
    }

    // Bike Wash Management
    private void manageBikeWash(Scanner scanner) {
        int bikeChoice;
        do {
            System.out.println("\n--- Manage Bike Wash ---");
            System.out.println("1. Add Bike Wash Record");
            System.out.println("2. List All Bike Wash Records");
            System.out.println("3. Delete Bike Wash Record by ID");
            System.out.println("4. Go Back");
            System.out.print("Enter your choice: ");

            bikeChoice = scanner.nextInt();

            switch (bikeChoice) {
                case 1:
                    System.out.print("Enter bike wash details: ");
                    String bikeDetails = scanner.next();
                    bikeWashService.addBikeWash(bikeDetails);
                    System.out.println("Bike wash record added successfully!");
                    break;
                case 2:
                    System.out.println("Listing all bike wash records:");
                    bikeWashService.getAllBikeWash().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int bikeId = scanner.nextInt();
                    bikeWashService.deleteBikeWashById(bikeId);
                    System.out.println("Bike wash record deleted successfully!");
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (bikeChoice != 4);
    }

    // Cycle Wash Management
    private void manageCycleWash(Scanner scanner) {
        int cycleChoice;
        do {
            System.out.println("\n--- Manage Cycle Wash ---");
            System.out.println("1. Add Cycle Wash Record");
            System.out.println("2. List All Cycle Wash Records");
            System.out.println("3. Delete Cycle Wash Record by ID");
            System.out.println("4. Go Back");
            System.out.print("Enter your choice: ");

            cycleChoice = scanner.nextInt();

            switch (cycleChoice) {
                case 1:
                    System.out.print("Enter cycle wash details: ");
                    String cycleDetails = scanner.next();
                    cycleWashService.addCycleWash(cycleDetails);
                    System.out.println("Cycle wash record added successfully!");
                    break;
                case 2:
                    System.out.println("Listing all cycle wash records:");
                    cycleWashService.getAllCycleWash().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int cycleId = scanner.nextInt();
                    cycleWashService.deleteCycleWashById(cycleId);
                    System.out.println("Cycle wash record deleted successfully!");
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (cycleChoice != 4);
    }

    // Weight Lift Vehicle Wash Management
    private void manageWeightLiftWash(Scanner scanner) {
        int weightChoice;
        do {
            System.out.println("\n--- Manage Weight Lift Vehicle Wash ---");
            System.out.println("1. Add Weight Lift Vehicle Wash Record");
            System.out.println("2. List All Weight Lift Vehicle Wash Records");
            System.out.println("3. Delete Weight Lift Vehicle Wash Record by ID");
            System.out.println("4. Go Back");
            System.out.print("Enter your choice: ");

            weightChoice = scanner.nextInt();

            switch (weightChoice) {
                case 1:
                    System.out.print("Enter weight lift vehicle wash details: ");
                    String weightDetails = scanner.next();
                    weightLiftVehicleWashService.addWeightLiftVehicleWash(weightDetails);
                    System.out.println("Weight lift vehicle wash record added successfully!");
                    break;
                case 2:
                    System.out.println("Listing all weight lift vehicle wash records:");
                    weightLiftVehicleWashService.getAllWeightLiftVehicleWash().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int weightId = scanner.nextInt();
                    weightLiftVehicleWashService.deleteWeightLiftVehicleWashById(weightId);
                    System.out.println("Weight lift vehicle wash record deleted successfully!");
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (weightChoice != 4);
    }
}
