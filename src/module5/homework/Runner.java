package module5.homework;


public class Runner {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(400, 2, "Kiev", "Radisson");
        controller.requestRooms(700, 2, "Maldives", "Four Seasons");
        controller.requestRooms(300, 2, "Prague", "Mariott");

        controller.check(new BookingComAPI(), new TripAdvisorAPI());
        controller.check(new BookingComAPI(), new TripAdvisorAPI());
        controller.check(new BookingComAPI(), new TripAdvisorAPI());



    }
}
