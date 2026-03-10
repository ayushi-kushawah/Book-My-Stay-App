public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization\n");

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailable);

        System.out.println();

        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailable);

        System.out.println();

        System.out.println("Suite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailable);

    }
}
