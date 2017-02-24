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
        Room[] room1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] room2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] room3 = apis[2].findRooms(price, persons, city, hotel);

        Room[] rooms = new Room[room1.length + room2.length + room3.length];
        int count = 0;
        for (int i = 0; i < room1.length; i++) {
            rooms[count] = room1[i];
        }
        for (int i = 0; i < room2.length; i++) {
            rooms[count] = room2[i];
        }
        for (int i = 0; i < room3.length; i++) {
            rooms[count] = room3[i];
        }

        return rooms;
    }

    Room[] check(API api1, API api2) {
        Room[] fromAPI1 = api1.getAll();
        Room[] fromAPI2 = api2.getAll();

        Room[] roomsCounted = new Room[1000];
        int countRooms = 0;
        for (int i = 0; i < fromAPI1.length; i++) {
            for (int j = 0; j < fromAPI2.length; j++) {
                if (fromAPI1[i].equals(fromAPI2[j])) {
                    roomsCounted[countRooms] = fromAPI1[i];
                    countRooms++;
                }
            }
        }
        roomsCounted = deleteEmptyUsers(roomsCounted);
        return roomsCounted;
    }

    private Room[] deleteEmptyUsers(Room[] users) {
        int count = 0;
        for (Room user : users) {
            if (user != null) count++;
        }
        Room[] afterUser = new Room[count];
        count = 0;
        for (Room user : users) {
            if (user != null) {
                afterUser[count] = user;
                count++;
            }
        }
        return afterUser;
    }

}
