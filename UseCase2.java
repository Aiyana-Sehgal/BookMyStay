/**
 * Hotel Booking Management System
 * Demonstrates abstraction, inheritance, and polymorphism
 * using different room types.
 *
 * @author AIYANA
 * @version 1.0
 */

abstract class Room {

    protected String roomType;
    protected int beds;
    protected double price;
    protected int size;

    public Room(String roomType, int beds, double price, int size) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
        this.size = size;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq ft");
        System.out.println("Price per night: $" + price);
    }
}

class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 80.0, 200);
    }
}

class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 120.0, 350);
    }
}

class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 250.0, 600);
    }
}

public class UseCase2 {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        System.out.println("===== Available Room Types =====");

        single.displayDetails();
        System.out.println("Available: " + singleAvailability);
        System.out.println();

        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleAvailability);
        System.out.println();

        suite.displayDetails();
        System.out.println("Available: " + suiteAvailability);
    }
}