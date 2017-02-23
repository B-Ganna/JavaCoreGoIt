package module5.homework;


public class Controller {
    private API apis[] = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[1] = tripAdvisorAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[2] = googleAPI;

    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] rooms = new Room[1000];
        for (int i = 0; i < rooms.length; i++) {

        }
        return null;
    }

    Room[] check(API api1, API api2) {
        Room[] result1 = api1.findRooms(0, 0, null, null);
        Room[] result2 = api2.findRooms(0, 0, null, null);

        Room[] fromAPI1 = api1.getAll();
        Room[] fromAPI2 = api2.getAll();

        int countRooms = 0;
        for (int i = 0; i < fromAPI1.length; i++) {
            if (result1.equals(result2)) {
                countRooms++;
            }
        }
        Room[] roomsCounted = new Room[countRooms];

        return roomsCounted;
    }

}
