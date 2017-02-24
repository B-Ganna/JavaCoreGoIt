package module5.homework;


import java.util.Date;

public class TripAdvisorAPI implements API {
    private Room[] rooms = new Room[6];
    Date date = new Date();

    public TripAdvisorAPI() {
        Room room1 = new Room(66721, 300, 2, date, "Mariott", "Prague");
        rooms[0] = room1;
        Room room2 = new Room(67323, 700, 2, date, "Four Seasons", "Maldives");
        rooms[1] = room2;
        Room room3 = new Room(98733, 320, 2, date, "Eleven Mirrors", "Kiev");
        rooms[2] = room3;
        Room room4 = new Room(78273, 290, 2, date, "Sophitel", "Mauritius");
        rooms[3] = room4;
        Room room5 = new Room(78237, 450, 2, date, "Hilton", "Berlin");
        rooms[4] = room5;
        Room room6 = new Room(78278, 390, 2, date, "Radisson", "Kiev");
        rooms[5] = room6;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] roomsFound = new Room[10];
        int count = 0;
        for (Room room : roomsFound) {
            boolean cvr = room.getPrice() == price && room.getPersons() == persons;
            boolean cvr2 = room.getCityName() == city && room.getHotelName() == hotel;
            if (cvr && cvr2) {
                roomsFound[count] = room;
                count++;
            }
            if (roomsFound == null) {
                roomsFound[0] = new Room(0, 0, 0, null, null, null);
            }
        }
        return roomsFound;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
