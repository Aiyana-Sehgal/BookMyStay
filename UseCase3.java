/**
 * Hotel Booking Management System
 * Demonstrates centralized room inventory management using HashMap.
 *
 * @author AIYANA
 * @version 3.1
 */

import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    private HashMap<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    public void updateAvailability(String roomType, int change) {
        int current = inventory.getOrDefault(roomType, 0);
        inventory.put(roomType, current + change);
    }

    public void displayInventory() {
        System.out.println("===== Current Room Inventory =====");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " available");
        }
    }
}

public class UseCase3 {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println(" Book My Stay - Hotel Booking App");
        System.out.println(" Version 3.1 - Centralized Inventory");
        System.out.println("===================================");

        RoomInventory inventory = new RoomInventory();

        inventory.displayInventory();

        System.out.println("\nChecking availability for Single Room:");
        System.out.println("Available: " + inventory.getAvailability("Single Room"));

        System.out.println("\nUpdating inventory (1 Single Room booked)");
        inventory.updateAvailability("Single Room", -1);

        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();
    }
}