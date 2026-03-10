import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    /* Stores available room count for each room type */
    private Map<String, Integer> roomAvailability;

    /* Constructor */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /* Initialize default availability */
    private void initializeInventory() {

        roomAvailability.put("SingleRoom", 5);
        roomAvailability.put("DoubleRoom", 3);
        roomAvailability.put("SuiteRoom", 2);

    }

    /* Returns the availability map */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /* Update availability */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }

}
