import java.util.Arrays;

/**
 * This class is responsible for tracking the parking spots
 * and return that information to the display in a way that
 * the incoming drivers know about the availability of the
 * parking spaces.
 */
public class ParkingManager {

    /**
     * Entry point for the application
     * @param args: Arguments coming from external applications.
     */
    public static void main(String[] args) {
        boolean[] allParkingSpots = new boolean[10];
        
        // TODO: Take input from the sensor and pass it here
        int markedSpot = getMarkedSpot();
        
        markParkingSpot(allParkingSpots, markedSpot);
        markParkingSpot(allParkingSpots, 5);
        markParkingSpot(allParkingSpots, 7);
        markParkingSpot(allParkingSpots, 5);
        markParkingSpot(allParkingSpots, 10);
        System.out.println(Arrays.toString(allParkingSpots));
    }
    
    /**
     * This method will read all sensors and will return a spot
     * that is just being occupied. For example the parking will
     * look like this:
     * 
     *   1 | 2 | 3 | 4 | 5
     *   6 | 7 | 8 | 9 | 10
     *   
     *   The numbers represent the parking spaces.
     * @return The spot as a form of number in case its occupied.
     */
    public static int getMarkedSpot() {
        return 3;
    }
    
    /**
     * 
     * @param parkingSpots: Current state of all of the parking
     * @param markedSpot: Number of parking area to mark as occupied.
     * @return true if the operation is successful, false otherwise.
     */
    public static boolean markParkingSpot(boolean[] parkingSpots, int markedSpot) {
        boolean sucessfullyMarked = false;
        
        if (parkingSpots[markedSpot-1] != true) {
            parkingSpots[markedSpot-1] = true;
            sucessfullyMarked = true;
        }

        return sucessfullyMarked;
    }

}
